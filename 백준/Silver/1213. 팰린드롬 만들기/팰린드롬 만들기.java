import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] alphabet = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 'A']++;
        }

        int cnt = 0;
        int midIdx = -1; // 가운데 들어갈 인덱스
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] % 2 != 0) {
                cnt++;
                midIdx = i;
            }

            if(cnt >= 2) {
                System.out.println("I'm Sorry Hansoo");
                return;
            }

            // 앞 절반만
            for (int j = 0; j < alphabet[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }
        
        String back = new StringBuilder(sb).reverse().toString();
        
        if(midIdx >= 0) {
            sb.append((char)(midIdx + 'A'));
        }

        sb.append(back);
        System.out.println(sb.toString());
    }
}
