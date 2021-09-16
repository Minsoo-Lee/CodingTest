// -, -, -, -, Sung Rak 님의 코드
// 하는 방식은 나와 동일하나, 구현하는 방식이 나와 살짝 다른 부분이 있음

package level1.caesarCipher_0916;

class OtherSolution {
    String solution(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 대/소문자를 구분하는 코드를 Character.isLower/UpperCase 로 구현
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }
}