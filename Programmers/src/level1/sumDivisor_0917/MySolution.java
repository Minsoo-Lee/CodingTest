package level1.sumDivisor_0917;

class MySolution {
    public int solution(int n) {
        int answer = 0;

        // 1과 자기자신 포함해서 검사사
       for (int i=1; i<=n; i++) {
            if (n%i == 0) answer += i;
            // 약수일 경우 answer 에 더함
        }
        return answer;
    }
}
