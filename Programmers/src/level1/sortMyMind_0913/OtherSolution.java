// 프로그래머스 -, 정선욱, 박재오, - 님의 코드

package level1.sortMyMind_0913;

import java.util.*;

class OtherSolution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        // n번쨰 글자를 맨 앞에 추가하여 비교하는 방법
        Collections.sort(arr);
        // 같은 경우 사전순으로 비교

        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        // 그 후에 맨 앞의 글자를 제외하고 answer에 옮김

        return answer;
    }
}
