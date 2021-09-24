// ujy0916, mikekang47, 김학선 님의 코드

package level1.matrixSum_0924;

class OtherSolution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;
        // answer을 0으로 초기화하지 않고 arr1로 초기화
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
                // arr1에 그대로 더해주는것과 동일
            }
        }
        return answer;
    }
}

