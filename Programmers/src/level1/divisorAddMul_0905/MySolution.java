// 약수의 개수가 짝수인지 홀수인지를 구하는 함수 작성

package level1.divisorAddMul_0905;

class MySolution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i<=right; i++) {
            answer += divNum(i) * i;
        }
        return answer;
    }

    public int divNum(int div) {
        int num = 0;
        for (int i=1; i<=div; i++) {
            if (div % i == 0) num++;
        }
        System.out.println(num);
        return num%2 == 0 ? 1 : -1;
        // 약수의 개수가 짝수면 1, 홀수면 -1 반환
    }
}