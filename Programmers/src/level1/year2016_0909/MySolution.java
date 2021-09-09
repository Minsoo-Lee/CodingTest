package level1.year2016_0909;

class MySolution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        // 1월 1일(365일 중 1일)이 금요일이니, 0번 인덱스는 목요일부터 시작
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 각 월마다 며칠까지 있는지 저장

        int days = 0;
        for (int i=0; i<a-1; i++) {
            days += month[i];
        }
        // 전월까지 모든 일수를 더한 후
        days += b;
        // 며칠인지를 더하면 a월 b일을 1월 1일 기준으로 며칠이 지났는지 알 수 있음
        answer = day[days%7];
        // 1월 1일이 금요일이니 7로 나눈 나머지로 요일을 구함

        return answer;
    }
}