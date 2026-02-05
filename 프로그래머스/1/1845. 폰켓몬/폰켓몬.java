import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int k = nums.length / 2; // 가져갈 수 있는 폰켓몬
        // 같은 종류 중복 제거할 set 선언 및 초기화
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int len = set.size();

        return Math.min(len, k);
    }
}