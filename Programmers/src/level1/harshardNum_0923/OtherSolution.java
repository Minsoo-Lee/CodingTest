// -, -, 조조조, -, - 님의 코드
// 반복문에서 x를 계산하지 않고 바로 나누어 계산하는 방법

package level1.harshardNum_0923;

class OtherSolution {
    public boolean solution(int num) {

        String[] temp = String.valueOf(num).split("");
        // 각 자릿수의 합을 String으로 split 하여 계산

        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
        // 자릿수의 합 계산 (sum 에 저장)

        if (num % sum == 0) {
            return true;
        } else {
            return false;
        }
        // 이 부분은 return num % sum == 0;
        // 한 문장으로 치환 가능
    }
}