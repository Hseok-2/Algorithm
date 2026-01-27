import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어 개수

        int count = 0; // 좋은 단어 개수
        while (N-- > 0) {
            Stack<Character> st = new Stack<>(); // 스택 생성
            String str = br.readLine();

            for (char ch : str.toCharArray()) {
                // 스택이 비어있다면 push
                if (st.isEmpty()) {
                    st.push(ch);
                } else {
                    if(st.peek() == ch) { // 글자가 같다면
                        st.pop(); // 꺼낸다
                    } else { // 같지 않다면
                        st.push(ch); // 넣는다
                    }
                }
            }
            if(st.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}