// for 루프로 탐색하는 기본적인 코드
// 평균 수행시간 0.02ms 로, 다른 코드에 비해 길 수 있지만 수행시간이 빠름

package level1.stringBasic_0914;

class MySolution {
    public boolean solution(String s) {
        boolean answer = true;

        // 길이가 4 혹은 6일 때만 숫자로만 구성되어 있는지 검사
        if (s.length() == 4 || s.length() == 6) {
            // 인덱스 0부터 끝까지 요소들이 모두 숫자인지 검사
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') continue;
                else {
                    answer = false;
                    break;
                }
            }
        }
        // 길이가 4도, 6도 아니면 false 저장
        else answer = false;

        return answer;
    }
}