package level1.addTen_0917;

class MySolution {
    public int solution(int n) {
        int answer = 0;

        while (n/10 != 0) {
            answer += n % 10;
            n /= 10;
        }
        // answer에 1의 자리, 10의 자리..., (n-1)의 자리 까지 더함
        answer += n;
        // n/10이 0이면 n자리 수만 남으므로 answer에 더해줌

        return answer;
    }
}