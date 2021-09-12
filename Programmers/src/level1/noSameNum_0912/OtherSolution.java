// 프로그래머스 Haeryong Jo, kimjooeun, pjh92077, -, 김지영 님의 코드
// 평균 실행시간: 0.045, 평균 효율성: 29.89

package level1.noSameNum_0912;

import java.util.*;

public class OtherSolution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();

        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
        // 이 부분에서 시간이 좀 걸리는게 아닌가 싶다... 굳이 preNum으로 비교할 필요가..?

        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
