package level1.weeklyChallenge4;

import java.util.*;

class OtherSolution {
    public String solution(String[] table, String[] languages, int[] preference) {

        String answer = "";

        int score=-1;

        for(String str : table){
            // 문자열을 공백 기준으로 나눔
            // 문자열 배열 t는 나랑 동일하게 나옴
            String[] t = str.split(" ");
            // 직업군의 이름을 tname에 저장
            String tname = t[0];
            int tscore = 0;

            for(int i=0;i<languages.length;i++){
                // 여긴 나랑 동일
                int idx = Arrays.asList(t).indexOf(languages[i]);
                // idx가 -1일 경우에 0으로 저장하지 않는다는 점이 다름.
                // idx가 순위에 있을 경우
                // 내 코드에서의 num == 여기의 tscore
                if(idx>-1) tscore+=preference[i]*(6-idx);
            }

            // score가 tscore과 같거나 answer이 tname보다 앞설 경우
            // answer에 tname 저장
            if(score ==tscore && answer.compareTo(tname)>0) answer=tname;

            // tscore이 더 클 경우
            if(score<tscore){
                // score에 tscore 저장 (최대값 저장)
                score =tscore;
                answer= tname;
            }
        }
        return answer;
    }
}