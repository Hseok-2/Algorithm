import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        int k = nums.length/2; // 기존 배열의 길이에서 /2 한 값

        int len = numbers.size(); // 중복 제거한 배열의 길이

        if(k <= len) {
            answer = k; // len보다 작다면 k값 자체가 정답
        } else {
            answer = len; // k가 더 크다면 len값 자체가 정답
        }

        return answer;
    }
}