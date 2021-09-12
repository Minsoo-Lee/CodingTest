// 프로그래머스 박철우, -, -, 이수빈, suebinmon님의 코드

package level1.sumBetTwo_0912;

class OtherSolution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
        // 큰 수와 작은 수를 구분해 넘겨 주어서
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
        // 등차수열의 합 공식으로 구하면 됨... 간단...
    }
}
