package level1.fintSqrt_0918;

class MySolution {
    public long solution(long n) {
        return Math.sqrt(n) == Math.round(Math.sqrt(n)) ? (long)(Math.pow(Math.sqrt(n)+1, 2)) : -1;
        // n의 제곱근과, 그것을 반올림 한 수가 같나? - 로 제곱근이 정수인지 판별
        // 정수라면 같게 됨

        // 맞다면 +1에 제곱을 반환
        // 아니라면 -1 반환
    }
}