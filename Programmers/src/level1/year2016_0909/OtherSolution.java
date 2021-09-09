// 프로그래머스 권용호 , david0206 , -님의 코드

package level1.year2016_0909;

class OtherSolution
{
    public String getDayName(int a, int b)
    {
        String answer = "";

        // 1월부터 12월까지 각 일에 요일을 매칭
        // 알고리즘 시도 자체는 훌륭하나 너무 비효율적인 것은 아닌지..?
        switch(a) {
            case 1:
                if(b % 7 == 1)
                    answer = "FRI";
                else if(b % 7 == 2)
                    answer = "SAT";
                else if(b % 7 == 3)
                    answer = "SUN";
                else if(b % 7 == 4)
                    answer = "MON";
                else if(b % 7 == 5)
                    answer = "TUE";
                else if(b % 7 == 6)
                    answer = "WED";
                else
                    answer = "THU";
                break;
            case 2:
                if(b % 7 == 1)
                    answer = "MON";
                else if(b % 7 == 2)
                    answer = "TUE";
                else if(b % 7 == 3)
                    answer = "WED";
                else if(b % 7 == 4)
                    answer = "THU";
                else if(b % 7 == 5)
                    answer = "FRI";
                else if(b % 7 == 6)
                    answer = "SAT";
                else
                    answer = "SUN";
                break;
            case 3:
                if(b % 7 == 1)
                    answer = "TUE";
                else if(b % 7 == 2)
                    answer = "WED";
                else if(b % 7 == 3)
                    answer = "THU";
                else if(b % 7 == 4)
                    answer = "FRI";
                else if(b % 7 == 5)
                    answer = "SAT";
                else if(b % 7 == 6)
                    answer = "SUN";
                else
                    answer = "MON";
                break;
            case 4:
                if(b % 7 == 1)
                    answer = "THU";
                else if(b % 7 == 2)
                    answer = "FRI";
                else if(b % 7 == 3)
                    answer = "SAT";
                else if(b % 7 == 4)
                    answer = "SUN";
                else if(b % 7 == 5)
                    answer = "MON";
                else if(b % 7 == 6)
                    answer = "TUE";
                else
                    answer = "WED";
                break;
            case 5:
                if(b % 7 == 1)
                    answer = "SUN";
                else if(b % 7 == 2)
                    answer = "MON";
                else if(b % 7 == 3)
                    answer = "TUE";
                else if(b % 7 == 4)
                    answer = "WED";
                else if(b % 7 == 5)
                    answer = "THU";
                else if(b % 7 == 6)
                    answer = "FRI";
                else
                    answer = "SAT";
                break;
            case 6:
                if(b % 7 == 1)
                    answer = "WED";
                else if(b % 7 == 2)
                    answer = "THU";
                else if(b % 7 == 3)
                    answer = "FRI";
                else if(b % 7 == 4)
                    answer = "SAT";
                else if(b % 7 == 5)
                    answer = "SUN";
                else if(b % 7 == 6)
                    answer = "MON";
                else
                    answer = "TUE";
                break;
            case 7:
                if(b % 7 == 1)
                    answer = "FRI";
                else if(b % 7 == 2)
                    answer = "SAT";
                else if(b % 7 == 3)
                    answer = "SUN";
                else if(b % 7 == 4)
                    answer = "MON";
                else if(b % 7 == 5)
                    answer = "TUE";
                else if(b % 7 == 6)
                    answer = "WED";
                else
                    answer = "THU";
                break;
            case 8:
                if(b % 7 == 1)
                    answer = "MON";
                else if(b % 7 == 2)
                    answer = "TUE";
                else if(b % 7 == 3)
                    answer = "WED";
                else if(b % 7 == 4)
                    answer = "THU";
                else if(b % 7 == 5)
                    answer = "FRI";
                else if(b % 7 == 6)
                    answer = "SAT";
                else
                    answer = "SUN";
                break;
            case 9:
                if(b % 7 == 1)
                    answer = "THU";
                else if(b % 7 == 2)
                    answer = "FRI";
                else if(b % 7 == 3)
                    answer = "SAT";
                else if(b % 7 == 4)
                    answer = "SUN";
                else if(b % 7 == 5)
                    answer = "MON";
                else if(b % 7 == 6)
                    answer = "TUE";
                else
                    answer = "WED";
                break;
            case 10:
                if(b % 7 == 1)
                    answer = "SAT";
                else if(b % 7 == 2)
                    answer = "SUN";
                else if(b % 7 == 3)
                    answer = "MON";
                else if(b % 7 == 4)
                    answer = "TUE";
                else if(b % 7 == 5)
                    answer = "WED";
                else if(b % 7 == 6)
                    answer = "THU";
                else
                    answer = "FRI";
                break;
            case 11:
                if(b % 7 == 1)
                    answer = "TUE";
                else if(b % 7 == 2)
                    answer = "WED";
                else if(b % 7 == 3)
                    answer = "THU";
                else if(b % 7 == 4)
                    answer = "FRI";
                else if(b % 7 == 5)
                    answer = "SAT";
                else if(b % 7 == 6)
                    answer = "SUN";
                else
                    answer = "MON";
                break;
            case 12:
                if(b % 7 == 1)
                    answer = "THU";
                else if(b % 7 == 2)
                    answer = "FRI";
                else if(b % 7 == 3)
                    answer = "SAT";
                else if(b % 7 == 4)
                    answer = "SUN";
                else if(b % 7 == 5)
                    answer = "MON";
                else if(b % 7 == 6)
                    answer = "TUE";
                else
                    answer = "WED";
                break;
        }
        return answer;
    }
    public static void main(String[] args)
    {
        OtherSolution test = new OtherSolution();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}
