import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (T-- > 0) {
            Queue<HashMap<Integer, Integer>> q = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, Integer.parseInt(st.nextToken()));
                q.add(map);
            }

            int printCount = 0; // 인쇄 순서

            while (!q.isEmpty()) {
                HashMap<Integer, Integer> currentMap = q.poll();
                int currentLocation = currentMap.keySet().iterator().next(); // 위치
                int currentPriority = currentMap.get(currentLocation);

                boolean isPrintable = true; // 인쇄 가능여부

                // 큐에 남아있는 다른 문서들과 중요도를 비교
                for (HashMap<Integer, Integer> mapInQue : q) {
                    int priorityQueue = mapInQue.values().iterator().next();
                    if(priorityQueue > currentPriority) {
                        isPrintable = false;
                        break;
                    }
                }

                // 인쇄 가능하다면
                if (isPrintable) {
                    printCount++;
                    if(currentLocation == M) {
                        sb.append(printCount).append('\n');
                        break;
                    }
                } else {
                    q.add(currentMap);
                }
            }
        }
        System.out.println(sb);

    }
}
