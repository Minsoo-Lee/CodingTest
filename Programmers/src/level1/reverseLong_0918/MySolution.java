package level1.reverseLong_0918;

import java.util.*;

class MySolution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        // 뒤집은 정수를 저장할 answer 변수 생성

        while (n / 10 > 0) {
            answer.add(n % 10);
            // 나눈 나머지를 저장
            n /= 10;
        }
        answer.add(n);
        return answer;
    }
}