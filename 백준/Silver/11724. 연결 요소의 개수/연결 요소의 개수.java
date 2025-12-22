import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N,M;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향 연걸
            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) { // 방문하지 않은 점이라면
                count++; // 1 증가
                dfs(i); // 방문처리
            }
        }

        System.out.println(count);
    }

    public static void dfs(int node) {
        visited[node] = true; // 방문처리

        for (int nextNode : graph[node]) {
            if (!visited[nextNode]) { // 방문처리 안된 노드가 있다면
                dfs(nextNode); // 탐색
            }
        }
    }
}
