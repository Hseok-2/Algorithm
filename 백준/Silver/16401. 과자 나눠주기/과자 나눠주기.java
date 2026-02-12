import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken()); // 조카 수
        int N = Integer.parseInt(st.nextToken()); // 과자 수

        int[] snack = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            snack[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(snack); // 오름차순 정렬

        int left = 1; // 가장 짧은 과자 길이
        int right = snack[N - 1]; // 가장 긴 과자 길이
        int answer = 0; // 결과 담을 변수

        while(left <= right) {
            int mid = (left + right) / 2;
            int snackEa = 0; // 과자 조각 수

            // 과자 조각 수 구하기
            for (int i = 0; i < N; i++) {
                snackEa += snack[i] / mid;
            }

            if(snackEa >= M) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
