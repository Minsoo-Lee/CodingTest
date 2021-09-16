// 프로그래머스 -, -, 재밌는영화추천좀, -, 이승윤 님의 코드

package level1.sumDivisor_0917;

// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
class OtherSolution {
    public int solution(int num) {
        int answer = 0;

        // 모든 약수의 합이기 때문에 절반까지만 해도 됨
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        OtherSolution c = new OtherSolution();
        System.out.println(c.solution(12));
    }
}

