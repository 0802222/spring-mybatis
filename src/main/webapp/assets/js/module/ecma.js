// 변수에 함수, 값, 객체를 담아봄
const clap = () => {
  console.log();
  console.log('👏👏👏👏👏')
  console.log();
}

const odd = '홀수';
const even = '짝수';
const hmd = {
  username: '하명도',
  age: 15
}

let count = 0;
const counter = () => {
  count++;
  console.dir(count);
}

export{odd, even, hmd, counter}
// 이 모듈을 호출했을때 기본으로 반환할 값 설정
export default clap;