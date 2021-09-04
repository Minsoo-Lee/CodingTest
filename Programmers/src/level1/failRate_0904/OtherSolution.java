// 프로그래머스 허현 님의 코드

package level1.failRate_0904;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class OtherSolution {
    public int[] solution(int N, int[] lastStages) {
        int nPlayers = lastStages.length;
        // 게임하는 유저 수 저장
        int[] nStagePlayers = new int[N + 2];
        for (int stage : lastStages) {
            nStagePlayers[stage] += 1;
            // nStagePlayers 배열에 해당 스테이지에 도달해 있는 사람 수 저장
        }

        int remainingPlayers = nPlayers;
        List<Stage> stages = new ArrayList<>();
        // Stage 객체를 담을 stages 리스트 생성

        for (int id = 1 ; id <= N; id++) {
            double failure = (double) nStagePlayers[id] / remainingPlayers;
            remainingPlayers -= nStagePlayers[id];
            // 실패율을 계산한 후, remainingPlayers 변수에 해당 스테이지에 도달한 사람 수를 뺀다.

            Stage s = new Stage(id, failure);
            stages.add(s);
        }
        Collections.sort(stages, Collections.reverseOrder());

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stages.get(i).id;
        }
        return answer;
    }

    class Stage implements Comparable<Stage> {
        public int id;
        public double failure;
        // 스테이지 번호와 실패율을 저장할 클래스 Stage

        public Stage(int id_, double failure_) {
            id = id_;
            failure = failure_;
        }

        @Override
        public int compareTo(Stage o) {
            if (failure < o.failure ) {
                return -1;
            }
            if (failure > o.failure ) {
                return 1;
            }
            return 0;
        }
        // 내림차순 정렬
    }
}