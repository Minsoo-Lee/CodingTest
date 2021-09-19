package level1.deleteMin_0919;

import java.util.*;

class MySolution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            int[] answer = {-1};
            return answer;
        }
        // 배열의 크기가 1개 이하라면 -1 리턴
        else {
            ArrayList<Integer> answer = new ArrayList<Integer>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
            // answer ArrayList에 arr 저장
            int min = Arrays.stream(arr).min().getAsInt();
            // arr 에서 최소값 추출

            int index = 0;
            while (answer.contains(min)) {
                if (answer.get(index) == min) {
                    answer.remove(index);
                    index = 0;
                }
                else index++;
            }
            // answer에서 최소값 제거

            int[] res = new int[answer.size()];
            for (int i=0; i<answer.size(); i++) {
                res[i] = answer.get(i);
            }
            return res;
        }
    }
}