// 처음에 정렬을 하는 것이 포인트
// for(int i=0; i<d.length; i++)가 아닌 for(int money: d)로 해결할 수 있지 않을까..?

package level1.budget_0907;

import java.util.Arrays;

class MySolution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        // d 정렬
        // -> 최대한 많은 부서에게 나누어 주기 위해서는 예산을 적게 필요로 하는 부서부터 나누어주는게 최대값을 갖는다 생각했기 때문
        for (int i=0; i<d.length; i++) {
            if (d[i] <= budget) {
                answer++;
                budget -= d[i];
            }
            // d[i]가 budget보다 작거나 같은 경우
            // == 예산을 분배할 수 있는 경우이므로 answer 에 1을 증가시키고 budget 에는 나눠준 예산만큼 뺀다.
            else {
                break;
                // d[i]가 budget보다 큰 경우
                // 예산을 더 이상 나누어 줄 수 없으므로 반복문 탈출
            }
        }
        return answer;
    }
}