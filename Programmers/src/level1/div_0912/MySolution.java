package level1.div_0912;

import java.util.*;

class MySolution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> tmp = new ArrayList<>();
        // 답을 저장할 임시 ArrayList 생성

        for (int n: arr) {
            if (n%divisor == 0) tmp.add(n);
        }
        // 나머지가 0이면 저장

        if (tmp.size() == 0) tmp.add(-1);
        // 빈 배열일 경우 -1 리턴

        int[] answer = new int[tmp.size()];
        for (int i=0; i<tmp.size(); i++) {
            answer[i] = tmp.get(i);
        }
        // ArrayList -> Array

        Arrays.sort(answer);
        return answer;
        // 배열 정렬 후 리턴
    }
}
