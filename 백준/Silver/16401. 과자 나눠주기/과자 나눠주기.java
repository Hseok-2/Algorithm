import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 조카의 수
        int N = Integer.parseInt(st.nextToken()); // 과자의 수

        int[] snacks = new int[N];
        int maxLen = 0;
        st = new StringTokenizer(br.readLine()); // 과자의 각 길이 입력
        for (int i = 0; i < N; i++) {
            snacks[i] = Integer.parseInt(st.nextToken());
            maxLen = Math.max(maxLen, snacks[i]);
        }

        int start = 1;
        int end = maxLen;

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;

            for (int i = 0; i < N; i++) {
                sum += snacks[i] / mid; // 과자 총 개수
            }

            if(sum >= M) {
                answer = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
