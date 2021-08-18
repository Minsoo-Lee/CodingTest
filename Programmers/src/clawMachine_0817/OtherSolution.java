// 프로그래머스 홍희표, -, illy, 주익정, syeon-c 님의 코드
// Stack을 이용한 풀이

package clawMachine_0817;

import java.util.Stack;

class OtherSolution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();


        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                // 1. board에서 0이 아닌 경우에만
                if (board[j][move - 1] != 0) {
                    // 2. stack이 비어있다면(제일 처음 과정) board의 수를 stack에 push한 후, 해당 board의 수를 0으로 교체한다.
                    if (stack.isEmpty()) {
                        stack.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }

                    // 3. 지금 탐색하는 수가 stack의 수와 같다면 stack의 마지막 요소를 pop한다.
                    //    그 후, answer에 2를 더한다.
                    if (board[j][move - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }

                    // 4. 그렇지 않은 경우에는 stack에 해당 인형의 숫자를 push한다.
                    else
                        stack.push(board[j][move - 1]);

                    // 5. 비교 및 삽입, 삭제 작업이 끝나면 해당 인형의 위치를 0으로 교체한다.
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
