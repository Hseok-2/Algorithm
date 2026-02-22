import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toLowerCase();
        int[] alphabet = new int[26];

        int maxAlpha = alphabet[0];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = ch - 'a';
            alphabet[n]++;
            maxAlpha = Math.max(maxAlpha, alphabet[n]);
        }

        int cnt = 0;
        char answer=0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alphabet.length; i++) {
            if(cnt > 1) break;
            if(alphabet[i] == maxAlpha) {
                cnt++;
                answer = (char)(i + 'A');
            }
        }

        if(cnt > 1) {
            sb.append("?");
        } else {
            sb.append(answer);
        }

        System.out.println(sb.toString());
    }
}
