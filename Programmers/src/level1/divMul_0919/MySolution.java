package level1.divMul_0919;

class MySolution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        for (int i=n; i>0; i--) {
            if (n%i == 0 && m%i == 0) {
                answer[0] = i;
                break;
            }
        }
        // 최소공약수를 구해서 저장

        int i=1;
        while (true) {
            if ((m*i) % n == 0) {
                answer[1] = (m * i);
                break;
            }
            i++;
        }
        // 최대공약수를 구해서 저장

        return answer;
    }
}