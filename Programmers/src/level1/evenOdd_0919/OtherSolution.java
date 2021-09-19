// 프로그래머스 -, polar, 정명훈, -, - 님의 코드
// 내 코드를 풀어서 쓰면 이렇게 됨

package level1.evenOdd_0919;

class OtherSolution {
    String solution(int num) {
        String result = "";
        if (num % 2 == 1) {
            result = "Odd";
        } else {
            result = "Even";
        }
        return result;
    }
}