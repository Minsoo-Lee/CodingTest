// 프로그래머스 김기준, 김수현, -, -, -님의 코드

package level1.mockTest_0829;

import java.util.ArrayList;

class OtherSolution {
    public int[] solution(int[] answer) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 1~3번째 학생들의 답안을 배열로 저장

        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        // score 배열에 정답 개수 저장

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        // maxScore에 세 학생 중 고득점을 저장

        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        // 고득점 학생을 list ArrayList에 저장
        // for문을 이용하지 않고 if문 3개를 이용하여 해결

        return list.stream().mapToInt(i->i.intValue()).toArray();
        // list를 배열로 변환
        // mapToInt를 이용해 Integer를 int형으로 변환하여 저장
    }
}
