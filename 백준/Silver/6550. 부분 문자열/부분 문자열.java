import java.util.*;
import java.io.*;

/**
 * 투 포인터
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();

        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);

            String s = st.nextToken();
            String t = st.nextToken();

            int idx = 0;
            for (int i = 0; i < t.length(); i++) {
                if(idx == s.length()) break;

                char sChar = s.charAt(idx);
                char tChar = t.charAt(i);
                if(sChar == tChar) {
                    idx++;
                }
            }

            if(idx == s.length()) {
                sb.append("Yes").append("\n");
            }else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}
