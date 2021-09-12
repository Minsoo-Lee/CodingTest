// 실행시간이 오래 걸림

package level1.sumBetTwo_0912;

class MySolution {
    public long solution(int a, int b) {
        long answer = 0;

        for (int i= (a<b?a:b); i<= (a>b?a:b); i++) answer += i;
        // for (int i = Math.min(a, b); i <= Math.max(a, b); i++) 이 더 낫지 않았나 싶음
        // -> a, b 둘 중 어떤게 더 큰 수인지 모르기 때문
        return answer;
    }
}

