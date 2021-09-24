package level1.nIntervalX_0924;

class MySolution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        // 0번 인덱스에 미리 x를 저장
        for (int i=1; i<n; i++) {
            answer[i] = answer[i-1] + x;
            // 그 이후부턴 전의 수 + x 진행
        }
        return answer;
    }
}
