import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        for (int i = 5; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int idx = Integer.parseInt(br.readLine());
            sb.append(dp[idx]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
