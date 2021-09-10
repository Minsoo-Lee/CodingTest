package level1.getMiddle_0910;

class MySolution {
    public String solution(String s) {
        int len = s.length();
        // len 대신 s.length()로 코드를 더 짧게 할 수는 있지만,
        // 그렇게 될 경우 가독성이 현저하게 떨어짐
        return len % 2 == 1 ? s.substring(len/2, len/2+1) : s.substring(len/2-1, len/2+1);
        // 길이가 홀수일 경우 가운데 한 글자만,
        // 길이가 짝수일 경우 가운데 두 글자를 출력
    }
}