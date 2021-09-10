// 프로그래머스 Nick H, KangyeolLee, 박관우, 구진법, nmin11님의 코드

package level1.dartGame_0910;

import java.util.*;

class OtherSolution {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();
        // 스택 변수 생성
        int sum = 0;
        // 총합은 0으로부터 시작

        for (int i = 0; i < dartResult.length(); ++i) {
            char c = dartResult.charAt(i);
            // 여기서 문자 배열이 아닌 문자열의 각 자리를 char 로 변환
            // 배열로 통쨰로 바꾸는 것 보단 이게 좋을지도
            if (Character.isDigit(c)) {
                sum = (c - '0');
                // 이 부분이 정말 좋은 것 같음
                // 문자를 숫자로 변환하는 방식을 c-'0'으로 수행

                if (sum == 1 && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    // 해당 자리의 숫자가 1이면서, 마지막 요소가 아니고, 다음 요소가 0이라면
                    // -> "10"이라는 숫자일 경우
                    sum = 10;
                    // sum은 해당 숫자가 아닌 10으로 설정
                    i++;
                    // 나와 동일하게 다다음 요소를 비교
                }
                stack.push(sum);
                // stack 에 sum push
            } else {
                // 숫자가 아닌 경우
                int prev = stack.pop();
                // prev에 pop 시킨 마지막 요소 저장
                if (c == 'D') {
                    prev *= prev;
                } else if (c == 'T') {
                    prev = prev * prev * prev;
                }
                // S인 경우는 놔두고, D, T인 경우 제곱 수행

                else if (c == '*') {
                    if (!stack.isEmpty()) {
                        // 아까 꺼낸 요소가 마지막이 아니라면
                        int val = stack.pop() * 2;
                        stack.push(val);
                        // *인 경우 현재 숫자(prev) 뿐만 아니라 이전 숫자(val)까지 두 배
                    }
                    prev *= 2;
                } else if (c == '#') {
                    prev *= (-1);
                } // #인 경우 마이너스

                stack.push(prev);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += stack.pop();
        }
        // 점수 합산
        return totalScore;
    }
}