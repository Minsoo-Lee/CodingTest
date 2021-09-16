package level1.stringToInt_0916;

class MySolution {
    public int solution(String s) {
        int answer = 0;
        if (s.charAt(0) == '-') answer = (-1) * getNum(s.substring(1));
        else if (s.charAt(0) == '+') answer = getNum(s.substring(1));
        else answer = getNum(s);

        return answer;
    }

    public int getNum(String s) {
        return Integer.parseInt(s);
    }
}
