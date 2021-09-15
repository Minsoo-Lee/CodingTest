// 시간초과가 계속 나서 인터넷 검색...
// 소수인지 판별하는 반복 횟수를 제곱근까지 줄여야 함
// -> "에라토스테네스의 체"

package level1.findPrimeNum_0915;

class MySolution {
    public int solution(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++) {
            if (findPrime(i)) answer++;
        }
        return answer;
    }

    public boolean findPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; //소수가 아니라면 false 리턴
        } return true; // 소수라면 true 리턴
    }
}
