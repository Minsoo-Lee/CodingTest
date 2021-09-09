// 프로그래머스 유준혁 님의 코드

package level1.weekylChallenge6_0909;

import java.util.*;

class OtherSolution {
    public int[] solution(int[] weights, String[] head2head) {
        int len = weights.length;
        // 선수 몇명인지 저장

        int[][] rank = new int[len][4];
        for(int i = 0; i < len; i++) {
            int w = weights[i], cnt = 0, win = 0, over = 0;
            for(int j = 0; j < len; j++) {
                char c = head2head[i].charAt(j);
                cnt += c == 'N' ? 0 : 1;
                win += c == 'W' ? 1 : 0;
                over += c == 'W' && weights[i] < weights[j] ? 1 : 0;
            }
            rank[i][0] = i + 1;
            rank[i][1] = (int)((double)win / cnt * 10000000);
            rank[i][2] = over;
            rank[i][3] = weights[i];
        }
        // 1열은 num, 2열은 승률, 3열은 무거운 사람 이긴 횟수, 4번은 몸무게

        Arrays.sort(rank, (a, b) -> {
            if(a[1] != b[1]) return b[1] - a[1];
            if(a[2] != b[2]) return b[2] - a[2];
            if(a[3] != b[3]) return b[3] - a[3];
            return a[0] - b[0];
        });
        // 람다식 이용하여 조건대로 정렬
        // 승률 -> 무거운 사람 이긴 횟수 -> 몸무게 -> 선수 번호

        int[] answer = new int[len];
        for(int i = 0; i < len; i++) answer[i] = (int)rank[i][0];
        return answer;
    }
}