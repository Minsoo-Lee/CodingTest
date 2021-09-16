// 프로그래머스 Sunhee Shin, -, 정선욱, 이상호, - 님의 코드

package level1.weirdString_0917;

class OtherSolution {
    public String solution(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        // char[]로 해도 될 것 같다.

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            // 공백이라면 cnt를 0으로 초기화, 아니라면 cnt++
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
            // 인덱스가 홀수면 소문자로, 짝수면 대문자로
            // (cnt+1을 먼저 수행하기 때문)
        }
        return answer;
    }
}
