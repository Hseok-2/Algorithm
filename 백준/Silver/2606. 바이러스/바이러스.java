import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;
    static int[][] graph;
    static boolean[] visited;
    static int computers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computers = Integer.parseInt(br.readLine());

        graph = new int[computers + 1][computers + 1];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        visited = new boolean[computers + 1];

        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int i = 1; i <= computers; i++) {
            if(graph[node][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}
