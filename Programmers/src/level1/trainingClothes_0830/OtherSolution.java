package level1.trainingClothes_0830;

class OtherSolution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        // 학생들이 가지고 있는 체육복의 수 - 1을 담을 배열

        int answer = n;
        // 처음엔 모두 체육복을 가지고 있다고 가정

        for (int l : lost)
            people[l-1]--;
        for (int r : reserve)
            people[r-1]++;
        // 도난당한 학생은 -1, 한장 가지고 있으면 0, 여벌 있으면 1

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                // 도난당한 학생일 경우
                if(i-1>=0 && people[i-1] == 1) {
                    // 앞사람이 여벌옷 가지고 있을 경우
                    people[i]++;
                    people[i-1]--;
                    // 도난당한 사람은 +1 (-1 -> 0)
                    // 빌려준 사람은 -1 (1 -> 0)
                }else if(i+1< people.length && people[i+1] == 1) {
                    // 뒷사람이 여벌옷 가지고 있을 경우
                    people[i]++;
                    people[i+1]--;
                    // 위 케이스와 동일
                }else
                    // 도난당한 사람이 옷을 빌리지 못한 경우 answer -1
                    answer--;
            }
        }
        return answer;
    }
}
