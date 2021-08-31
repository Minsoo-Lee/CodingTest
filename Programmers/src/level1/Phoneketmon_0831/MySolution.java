package level1.Phoneketmon_0831;

import java.util.HashMap;
import java.util.Map;

class MySolution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int n: nums) map.put(n, map.getOrDefault(n, 0) + 1);
        // map 변수에 중복 없이 nums의 요소를 저장

        int max = map.size();
        // max 선언 없이 map.size()로 바로 써도 되지만 가독성을 위해 적음

        if (max >= nums.length/2) return nums.length/2;
        // max 가 nums 의 길이/2보다 크다면 nums 의 길이/2 반환
        else return max;
        // 아니라면 max 반환
    }
}
