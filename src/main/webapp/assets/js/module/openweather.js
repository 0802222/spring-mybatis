import {OPENWEATHER_API_KEY} from '../config.js';


const API_URL = 'https://api.openweathermap.org/data/2.5/weather?';

const api = async coords => {
  const params = {
    appid: OPENWEATHER_API_KEY,
    lat: coords.latitude,
    lon: coords.longitude,
    units: 'metric'
  };
  const url = API_URL + new URLSearchParams(params).toString();
  const response = await fetch(url);
  console.log('응답 상태:', response.status);

  if (!response.ok) {
    throw new Error('날씨 API 응답 실패');
  }

  return response.json();

}

export default api;

