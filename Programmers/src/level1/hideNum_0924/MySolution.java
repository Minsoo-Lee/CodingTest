package level1.hideNum_0924;

class MySolution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i=0; i<phone_number.length(); i++) {
            // 일단 휴대폰 전체 번호까지 루프를 돌림
            answer += i < phone_number.length()-4 ? "*" : phone_number.charAt(i);
            // 끝에서 4번째 전 까지는 * 저장, 그 이후부턴 핸드폰 번호 그대로 저장
        }
        return answer;
    }
}
