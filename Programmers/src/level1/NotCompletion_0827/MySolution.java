package level1.NotCompletion_0827;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class MySolution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 더 수월한 계산을 위해 각 배열을 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        ArrayList<String> finish = new ArrayList<>();

        // 계산의 편의를 위해 completion 배열을 finish ArrayList로 대체
        finish.addAll(List.of(completion));


        for (int i=0; i<finish.size(); i++) {
            // 만약 finish의 i번째 요소와 partipans의 i번째 요소가 다르다면
            // (정렬을 한 상태이기 때문에 두 요소가 다르다는 것은 participant i번쨰 참가자가 완주하지 못함을 의미)
            // answer에 participant[i] 추가
            if (!finish.get(i).equals(participant[i])) {
                answer += participant[i];
                break;
            }
            // i번째가 finish의 마지막 인덱스라면
            // (participant의 마지막 참가자가 완주하지 못함을 의미)
            // answer에 participant[i] 추가
            else if (i == finish.size()-1) {
                answer += participant[i+1];
                break;
            }
        }
        return answer;
    }
}