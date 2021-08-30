package level1.mockTest_0829;

import java.util.Arrays;
import java.util.ArrayList;

class MySolution {
    public int[] solution(int[] answers) {
        int[] student = {0, 0, 0};
        // 각 학생이 맞춘 개수를 student 배열에 저장
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 첫 번째 사람은 1, 2, 3, 4, 5이기 때문에 배열로 만들지 않고 바로 계산

        ArrayList<Integer> top = new ArrayList<>();
        // 고득점자를 저장하는 top ArrayList 생성

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == i%5+1) student[0]++;
            if (answers[i] == second[(i%second.length)]) student[1]++;
            if (answers[i] == third[(i%third.length)]) student[2]++;
            // 답을 맞춘 사람은 student 배열에 개수 저장
        }

        int max = Arrays.stream(student).max().getAsInt();
        // 고득점자의 정답 개수를 max 변수에 저장

        for (int i=0; i<student.length; i++) {
            if (student[i] == max) top.add(i+1);
            // 고득점자의 정답 개수와 같은 학생을 top ArrayList에 저장
        }

        int[] answer = new int[top.size()];

        for (int i=0; i<top.size(); i++) {
            answer[i] = top.get(i);
        }
        // top ArrayList를 answer 배열로 저장
        return answer;
    }
}