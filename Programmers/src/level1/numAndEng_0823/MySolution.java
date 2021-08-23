package level1.numAndEng_0823;

import static java.lang.Character.isLetter;

class MySolution {
    public int solution(String s) {
        int answer = 0;
        char[] ch = s.toCharArray();
        // 편의성을 위해 s를 문자 배열로 변환

        String tmp = "";
        // s 중간중간에 들어있는 영문자를 숫자로 바꾸기 위해 만든 변수

        for (int i=0; i<ch.length; i++) {
            if (isLetter(ch[i])) {
                tmp += ch[i];
                // ch[i]가 문자라면 tmp에 이어붙임
                if (engToNum(tmp) <= 9) {
                    // engToNum을 통해 검사한 tmp가 9 이하의 숫자로 나온다면
                    // (zero~nine 범위에 있다면)
                    answer = answer*10 + engToNum(tmp);
                    // 기존 answer에 10을 곱하고 검사를 통해 나온 숫자를 더함
                    tmp = "";
                    // 다시 재검사를 위해 tmp 초기화
                }
            } else {
                // ch[i]가 숫자라면
                tmp = "";
                // 위 if문의 재검사를 위해 tmp 초기화
                answer = answer*10 + Integer.parseInt(String.valueOf(ch[i]));
                // 위 if문의 계산과 동일
            }
        }
        return answer;
    }
    // eng 문자열을 넘겨받아 이를 숫자로 치환할 수 있는지 검사사
    public static int engToNum(String eng) {

        switch (eng) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
                return 10;
        }
    }
}