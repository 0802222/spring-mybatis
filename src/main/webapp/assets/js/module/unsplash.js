import dayjs from 'https://cdn.jsdelivr.net/npm/dayjs@1.11.13/+esm';
import {UNSLPLASH_API_KEY} from "../config.js";


const URL = 'https://api.unsplash.com/photos/random?';
const params = {
  client_id: UNSLPLASH_API_KEY,
  orientation: 'landscape',
  query: 'landscape'
}

const queryString = new URLSearchParams(params);
const api = async () => {
  const response = await fetch(URL + queryString, {
    headers: {
      'Accept-Version': 'v1'
    }
  });

  return response.json();
}

async function createToken() {
  const {
    urls: {full: bg},
    location: {name: location}
  } = await api();

  //토큰만들기
  const newToken = {
    bg: bg,
    location: location,
    expire: dayjs().add(1, 'day')    //토큰만료일자 설정
  };

  //문자열로 넣기위해서 JSON 처리
  localStorage.setItem('unsplash-token', JSON.stringify(newToken));
  return newToken;
}
// 브라우저에서 F12 -> application tap ->  Window.localStorage, 세션스토리지
// 구조분해할당으로 꺼내주기
const getToken = async () => {
  const storedToken = JSON.parse(localStorage.getItem('unsplash-token'));

  // 만료일자가 오늘이후면 저장해둔 토큰반환, 아니면 새토큰 반환
  if(storedToken && dayjs().isBefore(storedToken.expire)){
    return storedToken;
  }

  return createToken();
}
export {api};
export default getToken;