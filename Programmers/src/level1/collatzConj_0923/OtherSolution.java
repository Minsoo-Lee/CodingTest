// 프로그래머스 -, -, -, -, - 님의 코드
// 나와 비슷하지만 반복문의 조건이 나와 다름

package level1.collatzConj_0923;

class OtherSolution {
    public int collatz(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            // 일단 500번 반복
            if (n == 1) return i;
            // 그 전에 1이 되면 해당 회차 반환
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }

        return -1;
        // 500번이 넘어가면 -1 반환
    }
}