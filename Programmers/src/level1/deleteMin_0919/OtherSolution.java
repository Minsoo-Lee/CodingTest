// 프로그래머스 -, 정도한, passport, kjb9301, - 님의 코드

package level1.deleteMin_0919;

class OtherSolution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        // answer 배열 크기는 arr-1
        int[] answer = new int[arr.length-1];
        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[minIndex]>arr[i]){
                minIndex = i;
            }
        }
        // 최소값 추출
        for(int i=minIndex+1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        // 최소값부터 인덱스를 한칸씩 당김
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}