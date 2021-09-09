package level1.weeklyChallenge1_0909;

class MySolution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        // 필요한 총 금액 저장
        
        for (int i=0; i<count; i++) {
            totalPrice += price * (i+1);
        }
        // 조건에 따라 총 금액 합산

        return totalPrice>money ? totalPrice-money : 0;
        // 총 금액이 잔고보다 클 경우 부족한 금액 리턴
        // 잔고가 넉넉할 경우 0 리턴
    }
}
