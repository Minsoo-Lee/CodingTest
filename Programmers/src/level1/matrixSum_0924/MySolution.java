package level1.matrixSum_0924;

class MySolution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr1[0].length];
        // answer 길이를 arr1과 같게 생성
        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                // 행렬의 덧셈 진행
            }
        }
        return answer;
    }
}