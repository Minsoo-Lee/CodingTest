package level1.caesarCipher_0916;

class MySolution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i=0; i<s.length(); i++) {
            // s.charAt(i)를 ch 변수에 저장 (가독성을 위해서)
            char ch = s.charAt(i);
            // 대/소문자는 밀어도 그대로 대/소문자여야 하기 때문에 대/소문자로 구분해서 경우를 나눈다.
            // 대문자일 경우
            if (ch >= 'A' && ch <= 'Z')
                answer += (char)((ch+n-'A') % 26 + 65);
            // 소문자일 경우
            else if (ch >= 'a' && ch <= 'z')
                answer += (char)((ch+n-'a') % 26 + 97);
            // 그 외의 경우(공백)
            else answer += ch;
        }
        return answer;
    }
}
