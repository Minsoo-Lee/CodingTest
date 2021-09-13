package level1.sortMyMind_0913;

import java.util.*;

class MySolution {
    public String[] solution(String[] strings, int n) {
        // 인덱스 n의 문자가 같은 문자열이 여럿일 경우 사전순으로 따지기 때문에
        // 처음에 미리 정렬을 수행한다.
        Arrays.sort(strings);

        String tmp;
        String max = strings[0];

        for (int i=0; i<strings.length; i++) {
            for (int j=0; j<strings.length-i-1; j++) {
                if (strings[j].charAt(n) > strings[j+1].charAt(n)) {
                    tmp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = tmp;
                }
            }
        }
        // n번쨰 글자를 기준으로 정렬

        return strings;
    }
}