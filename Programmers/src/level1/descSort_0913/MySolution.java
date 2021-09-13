package level1.descSort_0913;

class MySolution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        // 비교 / 정렬이 쉽도록 String 을 char 형 배열로 변경
        char tmp;

        // 버블 정렬 수행
        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<s.length()-i-1; j++) {
                if ((int)chArr[j] < (int)chArr[j+1]){
                    tmp = chArr[j];
                    chArr[j] = chArr[j+1];
                    chArr[j+1] = tmp;
                }
            }
        }

        // 문자 배열을 문자열로 변환
        for (char c: chArr) answer += c;
        return answer;
    }
}
