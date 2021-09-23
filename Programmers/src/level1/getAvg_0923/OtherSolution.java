// -, 덱스또, 이태훈, -, 탈퇴한 사용자 님의 코드
// 라이브러리로 해결
// 알고리즘 문제이기 때문에 추천하지 않음
// 속도 측면에서 많이 나쁨

package level1.getAvg_0923;

import java.util.Arrays;

class OtherSolution {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);

    }
}