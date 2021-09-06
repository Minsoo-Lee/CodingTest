package level1.ternaryReverse_0906;

class MySolution {
    public int solution(int n) {
        String ter = "";
        int answer = 0;

        while (n > 0) {
            ter += n%3;
            n /= 3;
        }
        // 나머지를 끝에 붙이면 후에 reverse를 할 필요가 없다.

        char[] terArray = ter.toCharArray();
        // 뒤집은 3진법 ter 문자열을 char 배열로 변환한다.
        int three = 1;

        for (int i=terArray.length-1; i >= 0; i--) {
            answer += (Character.getNumericValue(terArray[i]) * three);
            // 맨 끝 인덱스부터 시작해서 3진법을 10진법으로 변환
            three *= 3;
        }

        return answer;
    }
}