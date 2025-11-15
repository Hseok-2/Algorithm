import java.util.*;
import java.io.*;
class Solution {
    
    public int solution(int[] info, int[][] edges) {
        buildTree(info, edges); // 트리 생성
        int answer = 0; // 최대 양의 수를 저장할 변수

        // BFS를 위한 큐 생성 및 초기 상태 설정
        ArrayDeque<Info> queue = new ArrayDeque<>();
        queue.add(new Info(0, 1, 0, new HashSet<>()));

        while (!queue.isEmpty()) {
            Info now = queue.poll();
            answer = Math.max(answer, now.sheep); // 최대 양의 수 업데이트
            now.visited.addAll(tree[now.node]);

            // 인접한 노드들에 대해 탐색
            for (int next : now.visited) {
                // 기존 해시셋의 데이터를 복사하고 현재 방문한 정점을 해시셋에서 제거
                HashSet<Integer> set = new HashSet<>(now.visited);
                set.remove(next);

                if (info[next] == 1) { // 늑대인 경우
                   if(now.sheep != now.wolf + 1) {
                       queue.add(new Info(next, now.sheep, now.wolf + 1, set));
                   }
                } else { // 양인 경우
                    queue.add(new Info(next, now.sheep + 1, now.wolf, set));
                }
            }
        }

        return answer;
    }
    
    private static ArrayList<Integer>[] tree; // 트리 정보를 저장할 인접리스트

    // 현재 위치, 양의 수, 늑대의 수 방문한 노드 저장을 위한 클래스
    private static class Info {

        int node, sheep, wolf;
        HashSet<Integer> visited;
        public Info(int node, int sheep, int wolf, HashSet<Integer> visited) {
            this.node = node;
            this.sheep = sheep;
            this.wolf = wolf;
            this.visited = visited;
        }
    }

    // 트리 구축 메서드
    private static void buildTree(int[] info, int[][] edges) {
        tree = new ArrayList[info.length];

        for (int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
        }
    }
}