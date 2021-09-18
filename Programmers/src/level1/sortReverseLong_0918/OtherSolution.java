// 덱스또, 정보석 님의 코드

package level1.sortReverseLong_0918;

class OtherSolution {
    String res = "";

    public int solution(int n) {
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char) c) + res);
        // 람다식을 이용해 변환 -> 문자열 형식으로 출력
        return Integer.parseInt(res);
        // 문자열 형식 -> Int 변환
    }
}