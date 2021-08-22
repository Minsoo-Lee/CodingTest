package level1.recommendId_0822;

class MySolution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder();
        // 1. 문자열을 더 수월하게 다루기 위해 StringBuilder로 변환

        int i=0;
        for (i=0; i<new_id.length(); i++) {
            char ch = new_id.toLowerCase().charAt(i);
            // 2. 1단계-i번째 인덱스의 문자를 대문자일 경우 소문자로 치환
            if (ch == '-' || ch == '.' || ch == '_' || Character.isLetterOrDigit(ch))
                answer.append(ch);
            // 3. 2단계-빼기, 마침표, 밑줄, 숫자 혹은 알파벳일 경우 answer에 삽입
        }

        i = 0;
        while(i < answer.length()-1) {
            if (answer.charAt(i) == '.' && answer.charAt(i+1) == '.') {
                answer.deleteCharAt(i);
                i = 0;
                // 4. 3단계-while 루프를 돌리면서 .가 2개 이상일 경우 . 하나로 치환
            } else {
                i++;
            }
        }

        if (answer.length() == 0) {
            answer.append("aaa");
            // 5. 5단계-빈 문자열이라면 a를 대입하고, 7단계에 의해 최종 문자열은 "aaa"가 됨.
        } else {
            if (answer.charAt(0) == '.') answer.deleteCharAt(0);
            // 6. 4단계-마침표가 처음에 위치하면 제거
            if (answer.length() == 0) answer.append("aaa");
            // 7. 5단계-처음의 마침표를 제거한 후 빈 문자열이면 최종 문자열은 "aaa"가 됨.
            else {
                if (answer.charAt(answer.length()-1) == '.') answer.deleteCharAt(answer.length()-1);
                // 8. 4단계-마침표가 마지막에 위치하면 제거
            }
        }

        if (answer.length() >= 16) {
            answer.delete(15, answer.length());
            if (answer.charAt(answer.length()-1) == '.') answer.deleteCharAt(answer.length()-1);
            // 9. 6단계 수행
        } else if (answer.length() <= 2) {
            while (answer.length() < 3)
                answer.append(answer.charAt(answer.length()-1));
            // 10. 7단계 수행
        }

        return answer.toString();
    }
}