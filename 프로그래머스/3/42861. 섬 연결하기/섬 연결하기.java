import java.util.*;

class Solution {
    
    private static int[] parent;

    public int solution(int n, int[][] costs) {
        // 비용 기준으로 오름차순
        Arrays.sort(costs, (o1, o2) -> Integer.compare(o1[2],o2[2]));

        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int answer = 0; // 최소 신장 트리 총 비용
        int edges = 0; // 연결된 다리 수

        for(int[] edge : costs) {
            if(edges == n-1) {
                break;
            }

            if (find(edge[0]) != find(edge[1])) { // 루트 노드가 같지 않다면
                union(edge[0], edge[1]);
                answer += edge[2]; // 건설 비용 합산
                edges++; // 다리수 증가
            }
        }
        return answer;
    }
    
    // 파인드 연산
    public static int find(int x) {
        if(parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]); // 루트노드로 대입함으로써 경로 압축
    }

    // 유니온 연산
    public static void union(int x, int y) {
        int root1 = find(x);
        int root2 = find(y);
        parent[root2] = root1; // 두 집합을 하나의 집합으로 합침
    }
}