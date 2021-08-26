// 그냥 엄청 쉬웠던 기초 문제...
// 한줄이라도 더 줄일 수 있느냐가 관건

package level1.getYinYang_0825;

class MySolution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            // signs[i]가 true: 더하기
            else answer -= absolutes[i];
            // signs[i]가 false: 빼기
        }
        return answer;
    }
}
