// -, Hyun Woo Kim, -, -, - 외 159명

package level1.watermelon_0916;

class OtherSolution {
    public String solution(int n){
        String result = "";
        for (int i = 0; i < n; i++)
            result += i % 2 == 0 ? "수" : "박";
        // 나와 동일, 대신 조건식을 사용
        return result;
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
        OtherSolution wm = new OtherSolution();
        System.out.println("n이 3인 경우: " + wm.solution(3));
        System.out.println("n이 4인 경우: " + wm.solution(4));
    }
}