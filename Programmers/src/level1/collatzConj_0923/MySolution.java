package level1.collatzConj_0923;

class MySolution {
    public int solution(long num) {
        int count = 0;
        while (num != 1) {
            // 1이 아니라면 반복 수행 (1이 될 때 까지 반복)
            num = num%2 == 0 ? num / 2 : (num * 3) + 1;
            // num이 짝수면 /2, 홀수면 *3 + 1
            count++;
            // 반복횟수 세기
            if (count > 500) return -1;
            // 500번 넘어가면 -1 반환
        }
        return count;
    }
}