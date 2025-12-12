import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals(".")) break;

            ArrayDeque<Character> dq = new ArrayDeque<>();
            boolean isValid = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == '(' || ch == '[') {
                    dq.push(ch);
                } else if(ch == ')' || ch == ']') {

                    if (dq.isEmpty()) {
                        isValid = false;
                        break;
                    }

                    if (dq.peek() == '(' && ch == ')') {
                        dq.pop();
                    } else if (dq.peek() == '[' && ch == ']') {
                        dq.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if(isValid && dq.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
