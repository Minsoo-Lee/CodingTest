package level1.pyNum_0913;

class MySolution {
    boolean solution(String s) {
        boolean answer = true;

        int pNum = s.length() - s.replaceAll("[pP]", "").length();
        int yNum = s.length() - s.replaceAll("[yY]", "").length();
        // 해당 문자를 공백으로 변환하면 그 문자의 개수만큼 길이가 줄어드는 것을 이용하여
        // 문자가 몇 개 있는지 확인 가능

        if (yNum == pNum) return true;
        else return false;
    }
}
