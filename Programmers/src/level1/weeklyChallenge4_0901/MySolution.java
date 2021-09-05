package level1.weeklyChallenge4_0901;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class MySolution {
    public String solution(String[] table, String[] languages, int[] preference) {
        int[][] tableLang = new int[languages.length][5];

        // 직업군 언어 점수를 담을 Hashmap dev
        HashMap<String, Integer> dev = new HashMap<>();

        for (int i=0; i<languages.length; i++) {
            for (int j=0; j<table.length; j++) {
                // 테이블의 각 문자열을 공백을 기준으로 나눔
                // -> 직업군 언어1 언어2 언어3 언어4 언어5
                //     [0]   [1]  [2]  [3]   [4]  [5]
                // 로 쪼개짐
                String[] strLang = table[j].split(" ");

                //languages의 i번째 언어가 해당 직업군의 순위 안에 있을 경우 순위 리턴
                int index = Arrays.asList(strLang).indexOf(languages[i]);
                if (index > 0) index = 6-index;
                    // 순위에 없을 경우 indexOf는 -1를 리턴하므로 0으로 바꿔줌
                else index = 0;

                // index*preference[i] 가 너무 길어서 만든 변수
                int num = index * preference[i];

                // 처음 생성할 경우 해당 직군에 num을 넣고, 그 이후부터는 이미 존재하는 값 + num을 넣어줌
                if (i == 0) dev.put(strLang[0], num);
                else dev.put(strLang[0], dev.getOrDefault(strLang[0], num) + (num));
            }
        }

        // 최대값을 갖는 직업군을 담을 배열 (최대값이 중복될 수 있으므로 배열로 구현)
        ArrayList<String> max = new ArrayList<>();
        // 최대값을 저장할 int 형 변수 maxNum
        int maxNum = (Collections.max(dev.values()));

        for (String str : dev.keySet()) {
            if (maxNum == dev.get(str)) max.add(str);
        }

        // 최대값을 여러 직업군이 가질 경우 사전순이기 때문에 배열 정렬
        Collections.sort(max);

        return max.get(0);
    }
}