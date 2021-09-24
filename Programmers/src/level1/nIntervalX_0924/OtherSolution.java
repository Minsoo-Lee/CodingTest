// 이수민, -, -, -, - 님의 코드

package level1.nIntervalX_0924;

class OtherSolution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = x * (i + 1);
            // i번째에는 x의 배수를 지정
        }
        return answer;
    }
}