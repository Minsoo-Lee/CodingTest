package level1.getAvg_0923;

class MySolution {
    public double solution(int[] arr) {
        int answer = 0;
        for (int n : arr) {
            answer += n;
        }
        // for문을 이용하여 총합 계산
        return (double)answer/arr.length;
        // 평균을 따로 구하지 않고 그대로 리턴
    }
}