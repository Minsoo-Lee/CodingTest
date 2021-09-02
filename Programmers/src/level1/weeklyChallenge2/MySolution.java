package level1.weeklyChallenge2;

import java.util.Arrays;

class MySolution {
    public String solution(int[][] scores) {
        String answer = "";
        int[][] rotate = new int[scores.length][scores.length];
        // 계산이 수월하도록 scores를 90도 회전시켜 저장할 배열
        int[] grade = new int[scores.length];
        // 0~4번 학생의 점수 저장

        for (int i=0; i<scores.length; i++) {
            for (int j=0; j<scores.length; j++) {
                rotate[i][j] = scores[j][i];
            }
        }
        // score 90도 회전

        int scoreCount = 0;
        // 내가 자신에게 준 점수가 유일한 최대/최소값이 아닌 횟수

        for (int i=0; i<rotate.length; i++) {
            int max = Arrays.stream(rotate[i]).max().getAsInt();
            int min = Arrays.stream(rotate[i]).min().getAsInt();
            int maxCount = 0;
            int minCount = 0;
            // 최대최소값, 최대최소값 중복 횟수

            for (int j=0; j<rotate[i].length; j++) {
                if (rotate[i][j] == max) maxCount++;
                if (rotate[i][j] == min) minCount++;
            }
            scoreCount = 0;

            for (int j=0; j<rotate[i].length; j++) {
                if ((i == j) && ((max == rotate[i][j] && maxCount == 1) || (min==rotate[i][j]) && minCount==1)) {
                    continue;
                }
                // 자신에게 준 유일한 점수가 최대/최소값이라면 스킵
                else {
                    grade[i] += rotate[i][j];
                    scoreCount++;
                }
                // 아니라면 grade 배열과 scoreCount 변수에 각각 값을 저장
            }
            System.out.println((double)grade[i]/scoreCount);
            answer += getGrade((double)grade[i]/scoreCount);
        }
        System.out.println(answer);
        return answer;
    }

    public static String getGrade(double score) {
        // 학점을 출력하는 함수
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 50) return "D";
        else return "F";
    }
}