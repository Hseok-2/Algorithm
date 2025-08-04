import java.util.*;
class Solution {
    public int solution(String s) {
        int cnt = 0; // 카운트
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String str = s.substring(i) + s.substring(0, i);

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if(!((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']'))) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }
}