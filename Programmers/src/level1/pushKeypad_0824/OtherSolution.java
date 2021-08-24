// 프로그래머스 임준영, 박주영, 김상훈님의 코드

// 거리 구하는 함수와 어느 손을 누를지를 결정하는 함수를 따로 배정함
// -> 거리 구하는 함수를 따로 구현하는 것이 정말 좋은듯

package level1.pushKeypad_0824;

class OtherSolution {
    int[][] numpadPos = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};

    int[] leftPos = {3,0};
    int[] rightPos = {3,2};
    // 현위치

    String hand;

    public String solution(int[] numbers, String hand) {
        this.hand = (hand.equals("right")) ? "R" : "L";
        // 현재 어느 손잡이인지 R / L로 저장

        String answer = "";

        for (int num : numbers) {
            String Umji = pushNumber(num);
            answer += Umji;

            if(Umji.equals("L")) {leftPos = numpadPos[num]; continue;}
            if(Umji.equals("R")) {rightPos = numpadPos[num]; continue;}
            // 나는 left, right에 숫자를 저장했고, 이분들은 좌표를 저장함
        }
        return answer;
    }

    //num버튼을 누를 때 어디 손을 사용하는가
    private String pushNumber(int num) {
        if(num==1 || num==4 || num==7) return "L";
        if(num==3 || num==6 || num==9) return "R";

        // 2,5,8,0 일때 어디 손가락이 가까운가
        if(getDist(leftPos, num) > getDist(rightPos, num)) return "R";
        if(getDist(leftPos, num) < getDist(rightPos, num)) return "L";

        //같으면 손잡이
        return this.hand;
    }

    //해당 위치와 번호 위치의 거리
    private int getDist(int[] pos, int num) {
        return Math.abs(pos[0]-numpadPos[num][0]) + Math.abs(pos[1]-numpadPos[num][1]);
    }
}
