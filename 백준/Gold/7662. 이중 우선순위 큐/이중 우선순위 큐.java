import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 입력 데이터 수

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            PriorityQueue<Long> ascQ = new PriorityQueue<>();
            PriorityQueue<Long> descQ = new PriorityQueue<>(Collections.reverseOrder());
            HashMap<Long, Integer> map = new HashMap<>(); // 지연 삭제할 용도

            int k = Integer.parseInt(br.readLine()); // Q에 적용할 연산 개수
            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String first = st.nextToken();
                long num = Integer.parseInt(st.nextToken());

                // 삽입
                if(first.equals("I")) {
                    ascQ.offer(num);
                    descQ.offer(num);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else {
                    // 삭제
                    if(first.equals("D")) {
                        if(map.isEmpty()) continue;

                        if (num == 1) {
                            if(map.isEmpty()) continue;
                            delete(descQ, map);
                        } else {
                            delete(ascQ, map);
                        }
                    }
                }
            }
            // 두 개의 큐 동기화 하기
            cleanQ(ascQ, map);
            cleanQ(descQ, map);

            if(map.isEmpty()) {
                sb.append("EMPTY").append("\n");
            }else {
                sb.append(descQ.peek()).append(" ").append(ascQ.peek()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void delete(PriorityQueue<Long> q, HashMap<Long, Integer> map) {
        while (!q.isEmpty()) {
            long n = q.poll();
            int count = map.getOrDefault(n, 0);

            if(count == 0) continue;

            if(count == 1) {
                map.remove(n);
            }else {
                map.put(n, count - 1);
            }
            break;
        }
    }

    public static void cleanQ(PriorityQueue<Long> q, HashMap<Long, Integer> map) {
        while(!q.isEmpty() && map.getOrDefault(q.peek(), 0) == 0) {
            q.poll();
        }
    }
}
