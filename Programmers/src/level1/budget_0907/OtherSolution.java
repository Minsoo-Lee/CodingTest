// 프로그래머스 김민지, -, 김창욱, 한슬, -님의 코드
// 나와 해결한 방식이 매우 유사하며, 다른 코드들도 매우 비슷함

package level1.budget_0907;

import java.util.*;

class OtherSolution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            // budget -= d[i] 작업은 항상 수행
            if (budget < 0) break;
            // 그러다 budget이 음수일 경우 반복문 탈출
            // 0일 경우는 예산을 딱 맞춰서 나누어준 경우
            answer++;
            // 반복문을 탈출하지 못한 경우 answer++
        }

        return answer;
    }
}