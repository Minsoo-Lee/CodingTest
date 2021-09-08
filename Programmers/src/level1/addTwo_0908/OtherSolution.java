// 프로그래머스 bb, 탈퇴한 사용자, 박찬종, bb04265, otu165님의 코드
// 가독성은 좋지만 속도가 느리다는게 단점
// HashSet이 아닌 TreeSet을 이용하면 add하면서 정렬도 같이 된다고 함.

package level1.addTwo_0908;

import java.util.HashSet;
import java.util.Set;

class OtherSolution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        // 두 수를 더해서 나온 수를 저장할 HashSet 생성(변수명-set)

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
                // HashSet add 메소드를 이용하면 겹치는 수는 저장하지 않음
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
        // 정렬한 뒤에 배열로 바꾸어 set 리턴
        // TreeSet으로 할 경우 중간에 sorted() 제외 가능
    }
}