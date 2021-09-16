package level1.stringToInt_0916;

class OtherSolution {
    public int solution(String str) {
        boolean Sign = true;
        int result = 0;

        // 메소드를 따로 만들지 않고 그대로 진행
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if(ch !='+')
                result = result * 10 + (ch - '0');
        }
        return Sign?1:-1 * result;
        // 음수면 -1, 양수면 1을 곱함
    }
}
