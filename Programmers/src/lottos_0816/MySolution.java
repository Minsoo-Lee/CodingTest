package lottos_0816;

class MySolution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int check = 0;
        for (int i=0;i<lottos.length; i++) {
            if (lottos[i] == 0) zero++;
            else {
                for(int j=0;j<win_nums.length;j++) {
                    if (lottos[i] == win_nums[j]) {
                        check++;
                        break;
                    }
                }
            }
        }

        if (zero == 6) {
            answer[0] = 1;
            answer[1] = 6;
        } else if (check == 0) {
            answer[1] = 6;
            answer[0] = answer[1] - zero;
        } else {
            answer[1] = 7-check;
            answer[0] = answer[1] - zero;
        }
        return answer;
    }
}
