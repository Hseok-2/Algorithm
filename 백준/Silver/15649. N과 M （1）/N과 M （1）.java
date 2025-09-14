import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N + 1];
        int[] arr = new int[M];
        StringBuilder sb = new StringBuilder();

        dfs(0, N, M, visited, arr, sb);

        System.out.println(sb);
    }

    public static void dfs(int depth, int N, int M, boolean[] visited, int[] arr, StringBuilder sb) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                // 재귀 호출을 할 때도 모든 변수를 그대로 다시 넘겨줌
                dfs(depth + 1, N, M, visited, arr, sb);
                visited[i] = false; // 선택 취소
            }
        }
    }
}
