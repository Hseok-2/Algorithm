import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> c1 = initArray(cards1);
        Queue<String> c2 = initArray(cards2);
        Queue<String> g = initArray(goal);

        while (!g.isEmpty()) {
            if(c1.peek() != null && c1.peek().equals(g.peek())) {
                c1.poll();
                g.poll();
            }else if (c2.peek() != null && c2.peek().equals(g.peek())) {
                c2.poll();
                g.poll();
            }else {
                return "No";
            }
        }
        return g.isEmpty() ? "Yes" : "No";
    }
    
    public static Queue<String> initArray(String[] str) {
        Queue<String> queue = new ArrayDeque<String>();

        for (int i = 0; i < str.length; i++) {
            queue.add(str[i]);
        }

        return queue;
    }
}