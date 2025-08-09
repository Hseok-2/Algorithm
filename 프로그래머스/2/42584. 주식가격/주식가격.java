import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n]; // 가격이 떨어지지 않은 기간을 저장

        Stack<Integer> stack = new Stack<>(); // prices의 인덱스
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { // 스택이 비어있지 않고, 현재 가격이 이전 가격보다 낮은 경우
                int j = stack.pop(); // pop
                answer[j] = i - j;
            }
            stack.push(i); // 가격이 떨어지지 않은 인덱스를 저장
        }

        while (!stack.isEmpty()) {
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }

        return answer;
    }
}