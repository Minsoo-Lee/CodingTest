// 너무 길다.. 좀 더 깔끔하게, 코드를 줄일 필요가 있을 것 같다.

package level1.trainingClothes_0830;

import java.util.ArrayList;
import java.util.Arrays;

class MySolution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        ArrayList<Integer> both = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌옷이 있는데 도난당한 학생들의 번호 저장
        for (int i=0; i<lost.length; i++) {
            for (int j=0; j<reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    both.add(lost[i]);
                }
            }
        }

        ArrayList<Integer> borrow = new ArrayList<>();
        ArrayList<Integer> getShirt = new ArrayList<>();

        // 여벌옷이 있는데 도난당한 학생이 있을 경우
        // 그 학생을 제외하고 도난(getShirt), 여벌(borrow) 학생 배열에 추가
        // 도난 학생의 경우 정답 +1
        for (int i=0; i<reserve.length; i++) {
            if (!both.contains(reserve[i])) {
                borrow.add(reserve[i]);
            }
        }
        for (int i=0; i<lost.length; i++) {
            if (!both.contains(lost[i])) {
                getShirt.add(lost[i]);
            } else answer++;
        }


        for (int i=0; i<getShirt.size(); i++) {
            for (int j=0; j<borrow.size(); j++) {
                // CASE1: borrow의 j번째 요소가 getShirt의 i번째 요소보다 2 이상 클 때
                //        -> 도난당한 getShirt.get(i)번째 학생이 옷을 빌릴 수 없을 때
                // 안쪽 루프를 종료 (더 이상 옷을 빌릴 사람을 찾을 수 없기 때문)
                if (borrow.get(j) > getShirt.get(i)+1)
                    break;

                    // CASE2: borrow의 j번째 요소가 getShirt의 i번째 요소 +-1 일때
                    //        -> 여벌옷을 빌릴 수 있을 때
                    // 체육 수업을 들을 수 있으므로 answer +1
                    // 빌려준 학생은 더 이상 여벌옷이 없으므로 borrow 배열에서 제거
                    // 볼 일 끝났으니 안쪽 루프를 종료
                else if ((borrow.get(j) == getShirt.get(i)+1) || (borrow.get(j) == getShirt.get(i)-1)) {
                    answer++;
                    borrow.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}

