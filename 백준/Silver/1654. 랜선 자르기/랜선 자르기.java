import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수

        int[] arr = new int[K];
        long max = 0;

        // 입력 받기 및 최댓값 갱신
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 이분 탐색
        // min은 1, max는 입력받은 랜선 중 가장 긴 길이
        long min = 1;
        long mid = 0;

        while (min <= max) {
            mid = (min + max) / 2;
            long count = 0;

            // 현재 자르는 길이(mid)로 만들어지는 랜선 개수 합산
            for (int i = 0; i < K; i++) {
                count += (arr[i] / mid);
            }

            // 만들어진 개수가 목표(N)보다 작다면? -> 길이가 너무 길다는 뜻
            if (count < N) {
                max = mid - 1;
            }
            // 만들어진 개수가 목표(N)보다 크거나 같다면? -> 길이를 더 늘려봐도 됨 (최대 길이를 찾아야 하므로)
            else {
                min = mid + 1;
            }
        }

        // 최대 길이
        System.out.println(max);
    }
}