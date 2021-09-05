package level1.divisorAddMul_0905;

import java.util.*;
class OtherSolution {
    int yaksu(int x) {
        // HashSet 를 이용하여 약수 구하기
        if(x == 1) return 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= x / 2; i++) {
            if(x % i == 0) {
                set.add(i);
                set.add(x / i);
            }
        }
        return set.size();
        // 약수의 개수 리턴
    }

    public int solution(int left, int right) {
        int answer = 0;
        for(; left <= right; left++) answer += left * (yaksu(left) % 2 == 0 ? 1 : -1);
        // 약수의 개수가 짝수면 *1, 홀수면 *(-1) 리턴
        return answer;
    }
}