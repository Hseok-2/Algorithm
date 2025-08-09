class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(isPrimeNum(i)) answer++;
        }

        return answer;
    }
    
    public static boolean isPrimeNum(int num) {
        int end = (int)Math.sqrt(num);
        if(num < 2) return false;

        for (int i = 2; i <= end; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}