// 프로그래머스 -, -, 장현준, -, - 님의 코드

package level1.descSort_0913;

import java.util.Arrays;

public class OtherSolution {
    public class ReverseStr {
        public String reverseStr(String str){
            char[] sol = str.toCharArray();
            Arrays.sort(sol);
            // str 을 문자 배열로 변환한 후 정렬 진행
            return new StringBuilder(new String(sol)).reverse().toString();
            // 역순으로 정렬하여 return
        }
    }
}
