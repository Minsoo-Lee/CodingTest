package level1.dartGame_0910;

import java.util.ArrayList;

class MySolution {
    public int solution(String dartResult) {
        int realAnswer = 0;
        // 원래 문제에서는 이 부분이 answer 이었으나, 에디터에서 실수로 answer 라는 변수를 따로 저장해서
        // 그걸 고치는ㄷ것보다... 이 부분을 고치는게 덜 귀찮아서...
        char[] chArr = dartResult.toCharArray();
        // dartResult 문자열을 chArr 문자 배열로 바꿈
        ArrayList<Integer> answer = new ArrayList<>();
        // 숫자를 담을 answer 배열 생성

        int i=0;
        while(i < chArr.length)  {
            int tmp = 0;

            if (i < chArr.length-1){
                String str = String.valueOf(chArr[i])+String.valueOf(chArr[i+1]);
                if (str.equals("10")) {
                    answer.add(Integer.parseInt(str));
                    i++;
                    // 현재+다음 요소가 "10"이라면 10을 저장하고, 다다음 요소를 확인하게끔 해야 함
                    // -> 다음 요소는 0이기 때문
                }
                else if (Character.isDigit(chArr[i])) {
                    tmp = Character.getNumericValue(chArr[i]);
                    answer.add(tmp);
                    // 평범한 1의 자리 숫자라면 int 로 변환
                }
            }
            int index = answer.size()-1;

            if (chArr[i] == 'S') answer.set(index, (int) Math.pow(answer.get(index), 1));
            else if (chArr[i] == 'D') answer.set(index, (int) Math.pow(answer.get(index), 2));
            else if (chArr[i] == 'T') answer.set(index, (int) Math.pow(answer.get(index), 3));
            // S, D, T에 맞는 제곱을 수행

            if (chArr[i] == '*') {
                answer.set(index, answer.get(index) * 2);
                if (answer.size() >= 2)
                    answer.set(index-1, answer.get(index-1) * 2);
                // *인 경우 이전 인덱스와 현재 인덱스 요소를 두 배
                // 이전 인덱스가 없을 경우 현재 인덱스만 두 배
            }

            if (chArr[i] == '#') {
                answer.set(index, answer.get(index) * (-1));
                // #인 경우 마이너스
            }
            i++;
        }

        for (int n: answer) realAnswer += n;
        return realAnswer;
    }
}