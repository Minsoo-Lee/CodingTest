// 프로그래머스 박경철, -, 엄정기, -, 김현식 님의 코드

package level1.secretMap_0910;

class OtherSolution {
    // # 혹은 " "를 추가하는 부분과 2진법으로 변환하는 부분을
    // 재귀함수로 한 번에 구현
    public String makeSharp(int n, int m) {
        if(n == 0) {
            // 2진법이 끝났음에도 자릿수가 다 채워지지 않은 경우
            if( m > 0) {
                String str = "";
                for(int i = 0; i < m; i++) {
                    str += " ";
                }
                return str;
            }
            else return "";
        }
        else {
            return n % 2 == 0 ? makeSharp(n/2, m-1) + " " : makeSharp(n/2, m-1) + "#";
            // 2진법으로 바꾸고 공백과 #을 추가하는 부분
        }
    }
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            answer[i] = makeSharp(secretMap[i], n);
        }
        return answer;
    }
}
