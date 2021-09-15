// 프로그래머스 -, JegalJisu, 전은광, -, -님의 코드
// 예외 처리로 수행

package level1.stringBasic_0914;

class OtherSolution {
    public boolean solution(String s) {
        // 길이가 4 혹은 6인 경우에 한해서
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                // s를 int 형으로 변환
                return true;
                // 오류가 없으면 true 반환
            } catch(NumberFormatException e){
                return false;
                // 오류가 생길 경우 false 반환
            }
        }
        // 길이가 4, 6 모두 아닌 경우 false 반환
        else return false;
    }
}