// 프로그래머스 -, -, jrooney, -, coffeeSoda 님의 코드
// indexOf 메소드 사용 -

package level1.findMrKim_0915;

import java.util.Arrays;

public class OtherSolution {
    public String findKim(String[] seoul){
        //x에 김서방의 위치를 저장하세요.
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+ x + "에 있다";
    }
}
