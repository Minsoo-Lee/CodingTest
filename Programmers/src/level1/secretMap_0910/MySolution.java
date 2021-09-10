package level1.secretMap_0910;

class MySolution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0; i<n; i++) {
            char[] ch1 = getTwo(arr1[i], n).toCharArray();
            char[] ch2 = getTwo(arr2[i], n).toCharArray();

            answer[i] = getSharp(ch1, ch2, n);
        }
        return answer;
    }

    // 두 지도를 비교하여 최종 지도가 "#"인지 " "인지 결정하는 함수
    public String getSharp(char[] a, char[] b, int n) {
        String str = "";
        for (int i=0; i< n; i++) {
            if (a[i] == '#' || b[i] == '#') str += "#";
            else str += " ";
        }
        return str;
    }

    // 2진법으로 바꾸는 함수
    public String getTwo(int a, int n) {
        StringBuilder line = new StringBuilder();

        while (a>0) {
            if (a % 2 == 0) line.append(" ");
            else line.append("#");
            a = a / 2;
        }

        while (line.length() < n) {
            line.append(" ");
        }

        return line.reverse().toString();

    }
}