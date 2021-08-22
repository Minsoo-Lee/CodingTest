// 프로그래머스 김나현, 김윤욱 님의 코드

// replaceAll의 정규식으로 표현

package level1.recommendId_0822;

class OtherSolution {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();
        // 1. 1단계-new_id의 모든 대문자를 소문자로 치환

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        // 2. 2단계-"-_.a-z0-9"를 제외한 모든 문자를 제거
        //    정규식 [^abc]: a, b, c를 제외한 문자 1개 선택
        System.out.println(temp);

        temp = temp.replaceAll("[.]{2,}",".");
        // 3. 3단계-.가 2번 이상 반복되면 . 하나로 치환
        //    정규식 [abc]: a, b, c중 문자 1개 선택
        //    정규식 {a, b}: a~b 사이의 수만큼 반복(b를 생략할 경우 a~무한대로 반복)

        temp = temp.replaceAll("^[.]|[.]$","");
        // 4. 4단계-.가 처음이나 끝에 위치한다면 제거
        //    정규식 ^[a]: 시작이 a인지
        //    정규식 [a]$: 끝이 a인지

        System.out.println(temp.length());

        if(temp.equals(""))
            temp+="a";
        // 5. 5단계-빈 문자열이면 a 대입

        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        // 6. 6단계-첫 15개의 문자로 substring 작업을 한 후, 시작이나 끝이 .라면 제거

        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);
            // 7. 7단계-문자 길이가 2 이하라면 마지막 문자 반복

        answer=temp;
        return answer;
    }
}
