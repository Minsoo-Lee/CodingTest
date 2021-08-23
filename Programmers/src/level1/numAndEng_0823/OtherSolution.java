// 프로그래머스 김동혁, 전정찬 님의 코드

// 새로운 메서드를 만들지 않고 배열로 해결 - 배열과 인덱스를 접목시킴

package level1.numAndEng_0823;

class OtherSolution {
    public int solution(String s) {

        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // 영단어를 숫자로 치환해 줄 String 배열 strArr 선언 - 각 숫자에 맞는 영단어로 초기화

        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        // 0부터 9까지 for 루프를 돌려가며 각 영단어에 맞는 숫자로 치환

        return Integer.parseInt(s);
        // s는 String 타입이므로 Integer로 변환
    }
}
