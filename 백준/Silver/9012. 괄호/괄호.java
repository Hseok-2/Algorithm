import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            ArrayDeque<Character> s = new ArrayDeque<>();

            boolean isVps = true;
            for (char ch : str.toCharArray()) {
                if(ch=='(') {
                    s.push(ch);
                } else if (ch == ')') {
                    if (s.isEmpty()) {
                        isVps = false;
                        break;
                    }
                    s.pop();
                }
            }
            if(!s.isEmpty()) isVps = false;
            System.out.println(isVps ? "YES" : "NO");
        }
    }
}
