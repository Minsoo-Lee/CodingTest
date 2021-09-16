package level1.stringToInt_0916;

public class MySolution {
    public static void main(String[] args) {
        String s = "1234";
        int answer = 0;
        // -로 시작하면 인덱스 1부터 끝까지 수 * (-1)
        if (s.charAt(0) == '-') answer = (-1) * getNum(s.substring(1));
        // +로 시작하면 인덱스 1부터 끝까지 수를 그대로
        else if (s.charAt(0) == '+') answer = getNum(s.substring(1));
        // 부호가 없을 경우 문자열 전체를 int 형으로 리턴
        else answer = getNum(s);

        System.out.println(answer);
    }

    // 숫자로만 이루어진 문자열을 넣었을 때 해당 문자열을 int 형으로 리턴
    public static int getNum(String s) {
        int result = 0;
        result += Integer.parseInt(s);
        return result;
    }
}
