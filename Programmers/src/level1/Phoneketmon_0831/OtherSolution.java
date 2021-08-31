// 프로그래머스 김영수, 박춘명 님의 코드
// ArrayList를 이용한 풀이

package level1.Phoneketmon_0831;

import java.util.*;

class OtherSolution {
    public int solution(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        // 중복값 없이 ArrayList 에 요소를 담음 (3, 1, 2, 3 -> 3, 1, 2)

        return nums.length/2 > list.size() ? list.size():nums.length/2;
        // nums 의 길이/2가 list 의 길이보다 크다면 list 의 길이 반환
        // 아니라면 nums 의 길이/2 반환
    }
}