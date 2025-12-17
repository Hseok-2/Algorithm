import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수의 개수
        int M = Integer.parseInt(st.nextToken()); // 횟수 M

        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N + 1]; // 구간합 배열
        for (int i = 1; i < sum.length; i++) {
            sum[i] += sum[i - 1] + num[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = sum[b] - sum[a-1];
            sb.append(result).append("\n");
        }

        System.out.println(sb.toString());
    }
}
