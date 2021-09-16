package level1.addTen_0917;

import java.util.*;

class OtherSolution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            // while(true) 대신 while(n>=10)이 더 나을 듯
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }

        return answer;
    }
}