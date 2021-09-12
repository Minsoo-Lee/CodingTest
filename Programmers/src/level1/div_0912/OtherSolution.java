// 프로그래머스 -, latein, estgo201, -, 박준기 님의 코드
// 해당 답안은 문제가 바뀌기 전
// 정렬 필요 없고, 빈 배열일 경우 -1 리턴하지 않아도 됨

package level1.div_0912;

import java.util.Arrays;

public class OtherSolution {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}