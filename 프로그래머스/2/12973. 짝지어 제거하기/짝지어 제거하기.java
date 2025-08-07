import java.util.*;
class Solution
{
    public int solution(String s) {
        int n = s.length();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if(!stack.isEmpty() && stack.peekLast() == c) {
                stack.pollLast();
            } else {
                stack.addLast(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}