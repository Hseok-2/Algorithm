import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;

        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());

            if(target > last) {
                for (int j = last + 1; j <= target; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                last = target;
            }

            if (stack.peek() != target) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb.toString());
    }
}
