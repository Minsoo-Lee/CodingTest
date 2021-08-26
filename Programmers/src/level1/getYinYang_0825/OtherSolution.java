// 프로그래머스 yohanjang, Danbi Choi, 요오게, 김지석 님의 코드

package level1.getYinYang_0825;

class OtherSolution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        // 내 코드에서 2줄로 적었던 문장을 ?를 이용하여 한 문장으로 끝냄
        // signs[i]? 1 : -1
        // signs[i]가 true: 1 반환
        // signs[i]가 false: -1 반환
        return answer;
    }
}