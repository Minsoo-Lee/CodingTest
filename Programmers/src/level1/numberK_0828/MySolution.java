package level1.numberK_0828;

import java.util.Arrays;

class MySolution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // 정답을 담을 배열을 commands의 길이만큼 설정

        for (int i=0; i<commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // array에서 commands[i][0] 인덱스부터 commands[i][1] 인덱스까지 자른 배열을 arr에 저장
            Arrays.sort(arr);
            // arr 정렬
            answer[i] = arr[commands[i][2]-1];
        }

        return answer;
    }
}
