import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 보유 동전 종류
        int K = Integer.parseInt(st.nextToken()); // 가치의 합
        int cnt = 0; // 코인 개수

        int[] coins = new int[N];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = coins.length - 1; i >= 0; i--) {
            cnt += K / coins[i];
            K = K % coins[i];
            if (K == 0) break;
        }

        System.out.println(cnt);
    }
}
