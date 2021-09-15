// 프로그래머스 -, RedLiquidator 님의 코드
// 이렇게 하면 시간초과 나던데... 예전 문제라 그런가 보다.

package level1.findPrimeNum_0915;

class OtherSolution {
    int numberOfPrime(int n) {
        int result = 0;
        for(int i=2; i<=n; i++){
            for(int j=2; j<=i; j++){
                if(j == i){
                    ++result;
                } else if(i%j == 0){
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        OtherSolution prime = new OtherSolution();
        System.out.println( prime.numberOfPrime(10) );
    }

}
