import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean isTag = false; // 태그가 있는지 여부
        StringBuilder sb = new StringBuilder(); // 문자열 합산 후 출력

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                isTag = true;
                sb.append(c);
            } else if (c == '>') {
                isTag = false;
                sb.append(c);
            } else if (isTag) { // 태그 안 문자라면
                sb.append(c);
            } else { // 태그 밖 문자
                if(c == ' ') { // 공백이면 단어 뒤집기
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                } else {
                    stack.push(c);
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
