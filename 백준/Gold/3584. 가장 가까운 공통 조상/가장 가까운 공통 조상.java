import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            HashMap<Integer, Integer> node = new HashMap<>(); // 자식-부모 노드
            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N-1; j++) { // map 초기화
                st = new StringTokenizer(br.readLine());
                int parent = Integer.parseInt(st.nextToken());
                int child = Integer.parseInt(st.nextToken());
                node.put(child, parent);
            }

            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            sb.append(solution(node, n1, n2)).append("\n");
        }
        System.out.println(sb.toString());
}

    public static int solution(HashMap<Integer, Integer> map, int n1, int n2) {
        HashSet<Integer> allParent = new HashSet<>(); // 모든 부모 저장
        int cur = n1; // 현재 노드

        while (true) {
            allParent.add(cur);
            if (!map.containsKey(cur)) { // 부모가 없다면 break
                break;
            }
            cur = map.get(cur); // 부모 노드로 변경
        }

        cur = n2;

        while (!allParent.contains(cur)) { // 부모가 포함되지 않을때까지
            cur = map.get(cur); // 부모 노드로 이동
        }

        return cur;
    }
}