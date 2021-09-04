package level1.failRate_0904;

import java.util.*;

class MySolution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] getStage = new int [N];
        // 스테이지를 클리어한 사람 수
        int[] count = new int [N];
        // 스테이지에 도달한 사람 수

        for (int j=0; j<N; j++) {
            for (int i=0; i<stages.length; i++) {
                if (stages[i] >= j+1) {
                    count[j]++;
                    getStage[j]++;
                    // 스테이지에 도달하거나 클리어하면 count, getStage ++
                    if (stages[i] == j+1) {
                        getStage[j]--;
                        // 스테이지에 도달만 한 경우 (클리어하지 못한 경우) getStage--
                    }
                }
            }
        }

        HashMap<Integer, Double> fail = new HashMap<Integer, Double>();
        for (int i=0; i<N; i++) {
            if (count[i] == 0) {
                fail.put(i+1, 0.0);
            } else {
                fail.put(i+1, (double)(count[i]-getStage[i])/(double)count[i]);
            }
        }
        // fail HashMap 변수에 스테이지 번호(key), 실패율(value)을 저장

        List<Integer> listKeySet = new ArrayList<>(fail.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (fail.get(value2).compareTo(fail.get(value1))));

        // 실패율(value)을 기준으로 배열 정렬

        for (int i=0; i<listKeySet.size(); i++) answer[i] = listKeySet.get(i);

        // 정렬된 스테이지 번호(key) 값을 answer 배열에 삽입


        return answer;
    }
}