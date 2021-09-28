package level2.openChat_0928;

import java.util.*;

class MySolution {
    public String[] solution(String[] record) {

        HashMap<String, String> hm = new HashMap<>();
        int size = 0;

        for (String str : record) {
            String[] str1 = str.split(" ");
            if (str1[0].equals("Enter") || str1[0].equals("Change")) hm.put(str1[1], str1[2]);
            // for 반복을 수행하며 최종적으로 바뀐 닉네임과 아이디 저장
            if (str1[0].equals("Enter") || str1[0].equals("Leave")) size++;
            // answer 크기가 될 size 계산
        }


        String[] answer = new String[size];

        int index = 0;
        for (String str : record) {
            String[] str1 = str.split(" ");
            String tmp = "";
            if (!str1[0].equals("Change")) {
                switch (str1[0]) {
                    case "Enter" :
                        tmp += "님이 들어왔습니다.";
                        break;
                    case "Leave":
                        tmp += "님이 나갔습니다.";
                        break;
                }
                answer[index] = hm.get(str1[1]) + tmp;
                index++;
            }
            // 첫 글자가 Enter, Leave 일 경우에 한해서만 작업 수행
        }
        return answer;
    }
}