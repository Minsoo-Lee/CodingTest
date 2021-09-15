// 확실히 메소드 없이 직접 구현하는 편이 시간이 덜 든다.

package level1.findMrKim_0915;

class MySolution {
    public String solution(String[] seoul) {
        String answer = "";
        // seoul의 요소를 다 돌면서 수행
        // 정렬한 후 Binary Search로 탐색한다면?
        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) answer = "김서방은 " + i + "에 있다";
        }
        return answer;
    }
}