// 프로그래머스 조성민, 이문열, 이해니, -, 윤인식 님의 코드

package level1.reverseLong_0918;

class OtherSolution {
    public int[] solution(long n) {
        String a = "" + n;
        // ArrayList 를 쓰지 않고 문자열 사용
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            // n%10 > 0 이 아닌 n > 0으로 설정하면 굳이 마지막 수를 따로 넣어주지 않아도 자동으로 들어감
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
            // 이 부분은 나와 동일
        }
        return answer;
    }
}
