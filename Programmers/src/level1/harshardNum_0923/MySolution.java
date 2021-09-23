package level1.harshardNum_0923;

class MySolution {
    public boolean solution(int x) {
        int y = 0;
        // 자릿수 합을 계산할 변수
        int z = x;
        // x를 감소시켜 반복문 조건을 설정할 변수
        while (z > 0) {
            y += z%10;
            z /= 10;
        }
        return x%y == 0;
    }
}
