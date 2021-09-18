// 프로그래머스 김민지, -, -, 이민주, 정도한 님의 코드
// 내 코드를 풀어서 쓰면 이렇게 됨
// 가독성 면에선 이 코드가 더 좋을수도?

package level1.fintSqrt_0918;

class OtherSolution {
    public long solution(long n) {
        // n의 제곱근에 제곱을 하면 n이 다시 나오는가
        // 로 제곱근이 정수인지 판별
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        // 맞다면 +1에 제곱

        return -1;
        //아니면 -1 반환
    }
}
