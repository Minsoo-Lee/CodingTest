// 프로그래머스 김민지, -, 박종수, 이승우, 이하나 님의 코드

package level1.pyNum_0913;

class OtherSolution {
    boolean solution(String s) {
        s = s.toLowerCase();
        // 대소문자를 구별하지 않으므로 전부 소문자로 변환
        int count = 0;
        // p, y 개수의 차이를 저장할 변수

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p')
                count++;
            // p 가 나타나면 count 증가
            else if (s.charAt(i) == 'y')
                count--;
            // y가 나타나면 count 감소
        }

        if (count == 0)
            return true;
        // 두 문자의 개수가 같으면 count 는 0이 될 것
        else
            return false;
        // -> return count == 0; 으로 변환 가능
    }
}
