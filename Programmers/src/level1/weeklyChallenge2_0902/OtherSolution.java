// 프로그래머스 코딩테스트봇 님의 코드

package level1.weeklyChallenge2_0902;

class OtherSolution {
    public String solution(int[][] scores) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 학점을 차례로 저장할 sb 생성

        for(int j=0;j<scores[0].length;j++){
            int max = 0;
            int min = 100;
            int cnt = 0;
            int sum = 0;
            // 최대,최소값(max, int) / 점수 합계(cnt) / 최대최소값 중복 횟수 (cnt)

            for(int i=0;i<scores.length;i++){
                sum += scores[i][j];
                // 일단 해당 점수를 sum에 저장
                if(scores[j][j] == scores[i][j]){
                    cnt++;
                    // 자기 자신이 준 점수와 해당 점수가 같다면 cnt++
                }

                max = Math.max(max, scores[i][j]);
                // max값 저장
                min = Math.min(min, scores[i][j]);
                // min값 저장
            }

            int num = scores.length;
            if(cnt==1 && (scores[j][j] == max || scores[j][j] ==min )){
                sum -= scores[j][j];
                num--;
                // 내가 준 점수가 유일한 최대/최소값이라면 합계에서 해당 점수를 뺴고, num--
            }
            int score = sum/num;
            // 점수 구함

            if(score>=90){
                sb.append('A');
            } else if(score>=80){
                sb.append('B');
            } else if(score>=70){
                sb.append('C');
            } else if(score>=50){
                sb.append('D');
            } else {
                sb.append('F');
            }
        }
        // 학점을 출력

        answer = sb.toString();
        return answer;
    }
}