import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        System.out.println("<" + solution(n, k) + ">");
    }

    public static String solution(int n, int k) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            queue.addLast(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.addLast(queue.pollFirst());
            }
            sb.append(queue.pollFirst());
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
