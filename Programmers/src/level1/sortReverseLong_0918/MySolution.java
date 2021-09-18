package level1.sortReverseLong_0918;

import java.util.*;

class MySolution {
    public long solution(long n) {
        long answer = 0;
        String tmp = "" + n;
        // 사실상 쓰지 않는 변수 - 지워도 됨
        long[] longArr = new long[tmp.length()];
        int index=0;

        while (n>0) {
            longArr[index] = n%10;
            n/=10;
            index++;
        }
        // n을 단위별로 배열에 저장

        Arrays.sort(longArr);
        // 작은 수 -> 큰 수로 정렬

        long ten = (long)Math.pow(10, longArr.length-1);
        System.out.println(ten);

        for (int i=longArr.length-1; i>=0; i--) {
            answer += longArr[i] * ten;
            ten /= 10;
            System.out.println(answer);
        }
        // 큰 수 -> 작은 수로 재배열

        return answer;
    }
}