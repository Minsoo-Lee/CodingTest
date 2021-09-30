// 프로그래머스 롱아일랜드아이스티 , - , 임경호 , - , chaesang 님의 코드

package level2.LCD_0930;

class OtherSolution {
    public long solution(int[] num) {
        long answer = num[0],g;
        for(int i=1;i<num.length;i++){
            g=gcd(answer,num[i]);
            answer=g*(answer/g)*(num[i]/g);
        }
        return answer;
    }
    public long gcd(long a,long b){
        if(a>b)
            // a가 b보다 크다면
            return (a%b==0)? b:gcd(b,a%b);
        // 재귀함수 호출
        else
            return (b%a==0)? a:gcd(a,b%a);
    }
}
