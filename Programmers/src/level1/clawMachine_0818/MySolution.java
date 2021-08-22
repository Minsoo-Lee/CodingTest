package level1.clawMachine_0818;
import java.util.ArrayList;

class MySolution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // 1. 뽑은 인형을 담을 바구니 ArrayList 생성
        ArrayList<Integer> basket = new ArrayList<>();

        // 2. moves 배열을 이용해 인형을 뽑아 basket에 담기
        for (int i=0; i<moves.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[j][moves[i]-1] > 0) {
                    basket.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }

        // 3. basket 배열 인덱스를 훑어줄 i 변수를 0으로 초기화
        int i=0;

        // 4. i를 0부터 basket.size()-2까지 증가시키며 basket의 i번쨰, i+1번쨰 인덱스를 비교하여 둘이 같으면 두 인덱스를 삭제한다.
        //    이 때, basket.remove(i); basket.remove(i+1)를 하면 안되는 이유는, basket.remove(i)를 하고 나면 i+1번째 요소가
        //    i번째로 옮겨가기 때문에, basket.remove(i)를 두 번 해준다.
        //    만약 두 인덱스가 같다면 i를 0으로 다시 초기화시키고, answer 변수를 1 증가시킨다.
        //    두 인덱스가 같은 부분이 없어 끝까지 탐색을 완료하면 while 루프를 종료시킨다.
        while(i <= basket.size()-2) {
            if (basket.get(i) == basket.get(i + 1)) {
                basket.remove(i);
                basket.remove(i);
                i = 0;
                answer++;
            } else i++;
        }

        // 5. 4에서 구한 answer 값은 인형이 터진 횟수이기 때문에, 터진 인형의 개수를 구하기 위해서 answer에 2를 곱해준다.
        return answer*2;
    }
}
