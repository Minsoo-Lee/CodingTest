// -, peds, -, 허영민, - 님의 코드

package level1.hideNum_0924;

class OtherSolution {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        // 핸드폰 전체 번호를 배열로 저장해 두고,
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
            // 끝에서 4자리까지 *로 치환
        }
        return String.valueOf(ch);
    }
}