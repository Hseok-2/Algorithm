import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int maxNum = 0; // 최대로 지원할 수 있는 부서 수
        Arrays.sort(d);

        int cnt = 0; // 부서 수 카운트
        for (int price : d) {
            if (budget < price) break;
            else {
                budget -= price;
                cnt++;
            }
            if (maxNum < cnt) maxNum = cnt;
        }

        return maxNum;
    }
}