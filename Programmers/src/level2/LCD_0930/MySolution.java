package level2.LCD_0930;

import java.util.*;

class MySolution {
    public int solution(int[] arr) {
        boolean check = false;
        // 중간에 체크할 변수 선언
        Arrays.sort(arr);
        // 정렬이 안 되어 있을 수도 있으니 정렬 수행
        int answer = arr[arr.length-1];
        while (!check) {
            for (int i=0; i<arr.length; i++) {
                // 첫 숫자부터 마지막 숫자까지
                if (answer % arr[i] == 0) check = true;
                // 배수가 맞으면 check 에 true 저장
                else {
                    check = false;
                    break;
                    // 하나라도 배수가 아니면 check 에 false 저장한 후 for 문 탈출
                }
            }
            answer += arr[arr.length-1];
        }
        return answer-arr[arr.length-1];
    }
}