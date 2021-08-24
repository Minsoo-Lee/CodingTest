package level1.pushKeypad_0824;

import static java.lang.Math.abs;
import java.util.HashMap;

class MySolution {
    public String solution(int[] numbers, String hand) {
        HashMap<String, Integer> handNum = new HashMap<>();
        handNum.put("right", 11);
        handNum.put("left", 10);
        // handNum 변수에 <좌/우, 숫자> 저장

        int[][] dis = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}, {3, 0}, {3, 2}};
        // 숫자패드의 좌표 저장
        // 0~9까지 해당 좌표 저장, 10 및 11번쨰는 *와 #의 위치

        String answer = "";

        for (int i=0;i<numbers.length; i++) {
            int num = numbers[i];
            // 이 부분은 for (int num : numbers)로 쓰면 더 깔끔할듯

            if (num%3 == 1) {
                handNum.put("left", num);
                answer += "L";}
            // 1, 4, 7이면 왼손으로 누름
            // handNum Value 값에 해당 숫자 저장(손이 어느 숫자를 누르고 있는지)

            else if (num%3 == 0 && num != 0) {
                handNum.put("right", num);
                answer += "R";}
            // 3, 6, 9면 오른손으로 누름
            // handNum Value 값에 해당 숫자 저장(손이 어느 숫자를 누르고 있는지)

            else {
                int rightX = abs(dis[num][0]-dis[handNum.get("right")][0]);
                int rightY = abs(dis[num][1]-dis[handNum.get("right")][1]);
                int leftX = abs(dis[num][0]-dis[handNum.get("left")][0]);
                int leftY = abs(dis[num][1]-dis[handNum.get("left")][1]);
                // 왼손, 오른손의 좌표를 구함
                // 이 부분에서 느낀건데, 해시맵이 아닌 배열로 왼손/오른손의 좌표를 표현했으면 어떘을까 싶음

                if ((rightX+rightY) == (leftX + leftY)) {
                    handNum.put(hand, num);
                    answer += hand.substring(0, 1).toUpperCase();
                } else if ((rightX+rightY) < (leftX + leftY)) {
                    handNum.put("right", num);
                    answer += "R";
                } else {
                    handNum.put("left", num);
                    answer += "L";
                }
                // 2, 5, 8, 0일 때 어느 손을 쓸지 결정
            }
        }
        return answer;
    }
}
