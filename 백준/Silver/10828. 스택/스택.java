import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 스위치문 사용
            switch(st.nextToken()) {

                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    System.out.println(stack.isEmpty()? -1 : stack.pop());
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty()? 1 : 0);
                    break;

                case "top":
                    System.out.println(stack.isEmpty()? -1 : stack.peek());
            }
        }
    }
}
