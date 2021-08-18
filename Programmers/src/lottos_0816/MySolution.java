package lottos_0816;

class MySolution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // 1. 0의 개수와 맞춘 숫자의 개수를 담을 변수를 각각 zero, check로 선언해준 후 0으로 초기화한다.
        int zero = 0;
        int check = 0;

        // 2. for 루프를 거치면서 0의 개수, 맞춘 개수를 센다.
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

        // 3. 만약 모든 숫자가 0이라면(0의 개수가 6이라면) 최고 순위는 1등, 최저 순위는 6등이 된다.
        if (zero == 6) {
            answer[0] = 1;
            answer[1] = 6;
        }
        // 4. 만약 맞춘 개수가 하나도 없다면, 최저 등수는 6등이 되며, 최고 등수는 6등에서 0의 개수를 뺀 값이 된다.
        else if (check == 0) {
            answer[1] = 6;
            answer[0] = answer[1] - zero;
        } // 5. 3,4번에 해당되지 않는 경우라면 최저 등수는 7-(맞춘갯수)가 되며, 최고 등수는 최저 등수에서 0의 개수를 뺀 값이 된다.
        else {
            answer[1] = 7-check;
            answer[0] = answer[1] - zero;
        }
        return answer;
    }
}
