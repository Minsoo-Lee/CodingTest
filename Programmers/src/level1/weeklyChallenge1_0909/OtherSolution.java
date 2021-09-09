// 프로그래머스 유준혁, 류정문, Maro, 지수연, doh 님의 코드

package level1.weeklyChallenge1_0909;

class OtherSolution {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
        // 등차수열의 합 (price * (count * (count+1) / 2)을 이용하여 해결
        // 합이 0보다 크면 합 리턴, 합이 음수인 경우(잔고가 넉넉한 경우) 0 리턴
    }
}
