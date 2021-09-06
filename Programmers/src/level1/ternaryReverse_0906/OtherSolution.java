// 프로그래머스 wontae_Jang, 송재호, ㅇ, 이예지 님의 코드

package level1.ternaryReverse_0906;

class OtherSolution {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            // 여기서 3진법을 그대로 구현하기 때문에
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();
        // 여기서 바꿔주어야 하는 과정을 더 거치게 된다.

        return Integer.parseInt(a,3);
        // 3진법을 10진법으로 바꿔주는 메소드를 이용하였는데,
        // 이는 시간을 더 잡아먹는다.
    }
}