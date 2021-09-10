// 프로그래머스 -, 정승준, jihyeonmun 님의 코드
// 내가 1줄로 쓴 부분을 가독성 있게 풀어 쓴 코드

package level1.getMiddle_0910;

class OtherSolution {
    public String solution(String s) {
        int ans = s.length();
        if (ans % 2 == 1){
            return Character.toString(s.charAt(ans/2));
        }
        else{
            return s.substring(ans/2-1, ans/2+1);
        }
    }
}