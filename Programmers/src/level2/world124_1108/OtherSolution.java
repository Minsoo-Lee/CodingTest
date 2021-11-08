// 프로그래머스 -, 이유진, 윤혜정, -, - 님의 코드

package level2.world124_1108;

public class OtherSolution {
    public String solution(int n) {
        // 1, 2, 4를 하지 않고 4, 1, 2로 설정
        String[] num = {"4","1","2"};
        String answer = "";

        // 나머지는 나와 동일
        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}
