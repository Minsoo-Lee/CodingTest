package level1.weekylChallenge6_0909;

import java.util.ArrayList;
import java.util.Collections;

class MySolution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        ArrayList<Player> player = new ArrayList<>();

        for (int i=0; i<weights.length; i++) {
            int winHeavy = 0;
            int winCount = 0;
            int playCount = weights.length;
            // playCount에는 자신 포함 모든 선수 수를 저장

            for (int j=0; j<weights.length; j++) {
                if (head2head[i].charAt(j) == 'W') {
                    winCount++;
                    // 이기면 winCount++
                    if (weights[i] < weights[j]) winHeavy++;
                    // 무거운 사람을 이겼으면 winHeavy++
                } else if (head2head[i].charAt(j) == 'N') playCount--;
                // 경기를 해본 적이 없으면 playCount--
            }
            double winRate;
            if (playCount == 0) {winRate = 0.0;}
            // 한 번도 경기를 하지 않은 경우 승률은 0
            else winRate = (double)winCount/playCount;

            player.add(new Player(weights[i], i+1, winRate, winHeavy));
            // player ArrayList 에 차곡차곡 저장
        }

        Collections.sort(player);
        // 아래 compareTo에 정의한 순서대로 정렬

        for (int i=0; i<player.size(); i++) answer[i] = player.get(i).getNum();

        return answer;
    }

    public

    class Player implements Comparable<Player>{
        private int weight;
        private int num;
        private double winRate;
        private int winHeavy;
        // 선수의 몸무게, 번호, 승률, 무거운 사람 이긴 횟수(이하 모두 변수명)의 정보를 갖는 Player 클래스 생성

        public Player(int weight, int num, double winRate, int winHeavy) {
            this.weight = weight;
            this.num = num;
            this.winRate = winRate;
            this.winHeavy = winHeavy;
        }

        public int compareTo(Player p) {
            if (this.getWinRate() < p.getWinRate()) return 1;
            else if (this.getWinRate().equals(p.getWinRate())) {
                if (this.getWinHeavy() < p.getWinHeavy()) return 1;
                else if (this.getWinHeavy() == p.getWinHeavy()) {
                    if (this.getWeight() < p.getWeight()) return 1;
                    else if (this.getWeight() == p.getWeight()) {
                        if (this.getNum() > p.getNum()) return 1;
                        return -1;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        // 조건대로 정렬
        // winRate -> winHeavy -> weight -> num

        public int getWeight() { return this.weight; }
        public int getNum() { return this.num; }
        public Double getWinRate() { return this.winRate; }
        public int getWinHeavy() { return this.winHeavy; }

    }
}