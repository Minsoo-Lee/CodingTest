package level1.addTwo_0908;

import java.util.ArrayList;
import java.util.Arrays;

class MySolution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> addNum = new ArrayList<>();

        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int add = numbers[i] + numbers[j];
                if (!addNum.contains(add)) {
                    // 두 수를 더해서 나온 수가 기존에 있는 수가 아니라면
                    addNum.add(add);
                    // addNum 에 해당 수를 추가
                }
            }
        }

        int[] answer = new int[addNum.size()];
        // addNum 크기와 동일한 배열의 answer 생성
        for (int i=0; i<answer.length; i++) answer[i] = addNum.get(i);
        // addNum -> answer
        Arrays.sort(answer);
        // answer 정렬

        return answer;
    }
}
