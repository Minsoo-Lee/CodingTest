// 나의 코드 - 나와 있는 코드 중에선 제일 효율적인 듯?
// 평균 실행시간 0.042ms, 평균 효율성: 27.08ms

package level1.noSameNum_0912;

import java.util.*;

public class MySolution {
    public int[] solution(int []arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        // 맨 앞의 숫자는 시작 전 바로 넣음
        answer.add(arr[0]);

        // 그 다음 인덱스부터, 전의 인덱스와 비교해서 겹치지 않으면 추가
        for (int i=1; i<arr.length; i++)
            if (arr[i-1] != arr[i]) answer.add(arr[i]);

        int[] a = new int[answer.size()];

        for (int i=0; i<answer.size(); i++) a[i] = answer.get(i);
        // 함수의 반환 형식을 int[]가 아닌 ArrayList<Integer> 로 하면 더 빠르게 수행 가능

        return a;
    }
}
