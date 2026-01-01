import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M]; // M개의 숫자를 담을 배열

        dfs(1, 0);

        System.out.println(sb);
    }

    public static void dfs(int at, int depth) {
        // M개를 모두 골랐다면 문자열에 저장
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        // at부터 N까지 숫자 중 하나를 선택
        for (int i = at; i <= N; i++) {
            arr[depth] = i; // 현재 깊이 자리에 i를 넣음

            // 다음 깊이로 이동
            dfs(i + 1, depth + 1);
        }
    }

}
