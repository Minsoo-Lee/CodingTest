// 프로그래머스 JandB, jisqus, -, -, 김바다 님의 코드

// 라이브러리를 사용하지 않고 정렬 메서드를 만들어 구현

package level1.numberK_0828;

class OtherSolution {
    public int[] solution(int[] array, int[][] commands) {
        int n = 0;
        int[] ret = new int[commands.length];
        // commands 길이 만큼의 배열 ret 선언

        while(n < commands.length){
            int m = commands[n][1] - commands[n][0] + 1;
            // 자를 배열의 길이

            if(m == 1){
            // 길이가 1인 경우 (요소가 1개인 경우)
                ret[n] = array[commands[n++][0]-1];
                continue;
            }


            int[] a = new int[m];
            int j = 0;
            for(int i = commands[n][0]-1; i < commands[n][1]; i++)
                a[j++] = array[i];
            // array에서 commands[n][0] 인덱스부터 commnds[n][1] 인덱스까지 배열을 잘라서 저장

            sort(a, 0, m-1);
            // 자른 배열 정렬

            ret[n] = a[commands[n++][2]-1];
            // ret에 정답 대입
        }

        return ret;
    }

    void sort(int[] a, int left, int right){
    // 퀵 정렬로 구현 (시간 복잡도가 제일 낮음)
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do{
            while(a[pl] < x) pl++;
            while(a[pr] > x) pr--;
            if(pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        }while(pl <= pr);

        if(left < pr) sort(a, left, pr);
        if(right > pl) sort(a, pl, right);
    }
}
