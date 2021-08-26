// 프로그래머스 -, Jeong SuCheol님의 코드
// 나는 for루프를 여러 개 사용하면 시간이 지연될 것 같아 while 루프를 사용함
// -> 결과적으로 for 루프를 여러개 만 사용하는 것이 더 빠름

package level1.primeNumber_0826;

class OtherSolution {
    public int solution(int[] nums) {
        int ans = 0;

        // 나와 다르게 for 루프를 사용해서 풀이

        for(int i = 0; i < nums.length - 2; i ++){
            for(int j = i + 1; j < nums.length - 1; j ++){
                for(int k = j + 1; k < nums.length; k ++ ){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        ans += 1;
                    }
                }
            }
        }

        return ans;
    }
    public Boolean isPrime(int num){
        int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
            if(num % i == 0) cnt += 1;
        }
        return cnt == 1;
    }
}
