// 프로그래머스 흐억, shadowcat02 님의 코드

package lottos_0816;

import java.util.HashMap;
import java.util.Map;

public class OtherSolution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
                // 0 개수 counting
            }
            map.put(lotto, true);
            // map에 선택한 번호와 true값을 저장
        }

        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
            // map에 winNum과 동일한 숫자가 있다면 sameCount 증가
            // 이는 lottos 배열요소와 win_nums 배열요소를 비교하는 구문
            // 배열 그대로를 비교하는 것보다 hashmap을 사용해서 비교하여 for문을 1개로 줄임 (난 2개 씀)
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        // maxRank와 minRank에 각각 저장

        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;
        // maxRank와 minRank의 상한값을 6으로 지정

        return new int[] {maxRank, minRank};
    }
}
