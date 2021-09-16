package level1.weirdString_0917;

class MySolution {
    public String solution(String s) {
        String answer = "";

        int n = 0;
        // 공백을 기준으로 인덱스를 판단할 변수 n 생성

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 32)  {
                n = 0;
                answer += ch;
                continue;
                // 공백인 경우 n을 0으로 리셋
            }
            else {
                if (n%2 == 0) answer += Character.toUpperCase(ch);
                // 짝수번째 인덱스면 대문자로 변환
                else answer += Character.toLowerCase(ch);
                // 홀수번째 인덱스면 소문자로 변환
            }

            n++;
        }
        return answer;
    }
}
