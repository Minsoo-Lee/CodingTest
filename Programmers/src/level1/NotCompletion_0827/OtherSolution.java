package level1.NotCompletion_0827;

import java.util.HashMap;

class OtherSolution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // hm 해쉬맵 생성
        HashMap<String, Integer> hm = new HashMap<>();

        // getOrDefault(key, defaultValue): key의 값이 존재하면 키의 값을, 없다면 defaultValue를 반환
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);

        // hm에 player라는 키가 존재하면 1을 뺀다.
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        // 결과적으로 중복값이 없는 경우에는 Value에 0이 저장될 것

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                // 해당 key의 값이 0이 아니라면 answer에 key 저장
                answer = key;
            }
        }
        return answer;
    }
}
