// 프로그래머스 이홍원, -, 최영록, -, - 님의 코드

package level1.divMul_0919;

class OtherSolution {
    public int[] solution(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a, b);
        // 최소공배수 구함
        answer[1] = (a * b) / answer[0];
        // 최대공약수 = (a * b) / 최대공약수 (공식)
        return answer;
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }
}
