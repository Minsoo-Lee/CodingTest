package level1.watermelon_0916;

class MySolution {
    public String solution(int n) {
        String answer = "";
        String subak = "수박";
        for (int i=0; i<n; i++) {
            answer += subak.charAt(i%2);
            // 홀수 번쨰 인덱스에는 "수", 짝수 번째 인덱스에는 "박" 저장
        }
        return answer;
    }
}
