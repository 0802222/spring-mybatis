import {KAKAOBOOK_API_KEY} from '../config.js';

const API_URL ='https://dapi.kakao.com/v3/search/book?';

const api = async params => {
  const queryString = new URLSearchParams(params).toString();
  const response = await fetch(API_URL+queryString, {
    headers: { Authorization: `KakaoAK ${KAKAOBOOK_API_KEY}` }
  });
  return response.json();
}

export default api;
