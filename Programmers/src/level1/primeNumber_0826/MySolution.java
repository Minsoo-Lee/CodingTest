package level1.primeNumber_0826;

class MySolution {
    public int solution(int[] nums) {
        int answer = 0;
        int i = 0;
        int j = 1;
        int k = 2;
        // i는 오른쪽 인덱스, j는 가운데 인덱스, k는 왼쪽 인덱스

        while (i < nums.length-2) {
            // 배열의 세 숫자를 더하는 경우의 수를 모두 구하는 루프
            // i는 오른쪽 인덱스이기 때문에 num.length보다 2가 적어야 함
            if (ifPrime(nums[i] + nums[j] + nums[k])) answer ++;
            // 더한 세 숫자가 소수라면 answer에 1을 더함

            if (k == nums.length-1) {
                // k가 맨 끝의 인덱스에 도착하면
                if (j == nums.length-2) {
                    // j가 k의 바로 왼쪽에 위치하면
                    i++;
                    j = i+1;
                } else {
                    j++;
                }
                k = j+1;
            } else k++;
        }

        return answer;
    }

    // n이 소수인지 검사
    public static boolean ifPrime(int n) {
        int count = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                count++;
            }
            // i와 n을 나누어을 때 나머지가 없으면(약수이면)
            // count에 1을 더함
        }
        if (count == 2) return true;
        // count가 2라면 (약수가 2개라면) 소수이기 때문에 true 반환
        else return false;
    }
}