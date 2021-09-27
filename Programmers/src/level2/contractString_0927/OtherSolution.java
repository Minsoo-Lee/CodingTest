package level2.contractString_0927;

class OtherSolution {
    public int solution(String s) {
        int min = s.length();
        int len = s.length()/2+1;
        for(int i = 1; i < len; i++) {
            String before = "";
            int sum = 0;
            int cnt = 1;
            for(int j = 0; j < s.length();) {
                int start = j;
                j = (j+i > s.length()) ? s.length():j+i;
                String temp = s.substring(start, j);
                if(temp.equals(before)) {
                    // 이전 문자열과 현재 문자열이 같으면
                    cnt++;
                    // 반복횟수 증가
                } else {
                    // 다르다면
                    if(cnt != 1) {
                        sum += (int)Math.log10(cnt)+1;
                    }
                    // 현재 반복횟수의 자리수를 sum에 저장
                    cnt = 1;
                    sum+=before.length();
                    // sum 에 반복횟수 자리수 + 해당 문자열 길이
                    before = temp;
                }
            }

            sum+=before.length();
            if(cnt != 1) {
                sum += (int)Math.log10(cnt)+1;
            }
            min = (min > sum) ? sum : min;
            // 최소값 판별
        }

        return min;
    }
}