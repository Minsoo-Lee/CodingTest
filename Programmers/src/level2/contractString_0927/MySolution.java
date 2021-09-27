package level2.contractString_0927;

import java.util.LinkedList;
import java.util.Queue;

// 자른 문자열과 그 반복 횟수에 대한 정보를 담고 있는 클래스
class MyString {
    private String alpha;
    private int num;

    public MyString(String alpha, int num) {
        this.alpha = alpha;
        this.num = num;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class MySolution {
    public int solution(String s) {
        int answer = 0;
        int min = s.length();
        Queue<MyString> queue = new LinkedList<>();

        for (int i=1; i<=s.length() / 2; i++) {
            String cut = "";
            int count = 1;
            int j = 0;
            while ((j + i) + i <= s.length()) {
                String now = s.substring(j, j+i);
                String next = s.substring(j+i, j+2*i);

                if (now.equals(next)) {
                    // 현재 자른 문자열과 다음에 자를 문자열이 같다면
                    count++;
                    // 반복횟수 ++
                } else {
                    // 다르다면
                    MyString myString = new MyString(now, count);
                    queue.add(myString);
                    count = 1;
                    // 지금까지의 정보를 myString 객체에 담은 후 이를 queue에 add 해줌
                }
                j += i;
                if (j + 2 * i > s.length()) {
                    next = s.substring(j);
                    MyString myString = new MyString(next, count);
                    queue.add(myString);
                    count = 1;
                }
                // 마지막일 경우에도 저장
            }
            while (!queue.isEmpty()) {
                MyString myString = queue.poll();

                if (myString.getNum() == 1) {
                    cut += myString.getAlpha();
                } else if (myString.getNum() > 1) {
                    cut += myString.getNum() + myString.getAlpha();
                }
                // 횟수 + 문자열을 그대로 cut에 저장
            }
            if (min > cut.length()) min = cut.length();
            // 최소값 판별
        }
        return min;

    }
}
