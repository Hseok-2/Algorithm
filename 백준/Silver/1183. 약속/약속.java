import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 마법사 N명

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            arr[i] = n1-n2;
        }

        // 정렬
        Arrays.sort(arr);

        int T = 0;
        // 짝수
        if (N % 2 == 0) {
            T = Math.abs(arr[N/2-1] - arr[N/2]) + 1;
        } else { // 홀수라면
            T = 1;
        }

        System.out.println(T);
    }
}
