package level2.world124_1108;

public class MySolution {
    public String solution(int n) {
        String base = "124";
        // base(진법)을 124(3진법)으로 설정
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            // 자연수만 취급하므로 1씩 감소시켜줌
            n--;
            // 나머지를 base의 문자에 대입
            answer.append(base.charAt(n % 3));
            // 3씩 나눠가며 진행
            n /= 3;
        }

        // 거꾸로 저장되어 있기 때문에 다시 거꾸로 바꿔줌
        return answer.reverse().toString();
    }
}
