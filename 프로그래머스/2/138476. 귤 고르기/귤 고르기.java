import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder()); // 개수별로 내림차순

        int numType = 0; // 크기 별 종류 수
        int curSum = 0; // 현재 개수 합

        for (int num : list) {
            curSum += num;
            numType++;
            if (curSum >= k) {
                break;
            }
        }

        return numType;
    }
}