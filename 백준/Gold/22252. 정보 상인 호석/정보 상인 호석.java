import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        long answer = 0; // 금액 총합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine()); // 쿼리 개수

        HashMap<String, PriorityQueue<Integer>> infoMap = new HashMap<>(); // 정보를 얻은 고릴라들

        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first = st.nextToken(); // 숫자 정보를 담을 변수
            String name = st.nextToken(); // 고릴라 이름

            if (first.compareTo("1") == 0) {
                int k = Integer.parseInt(st.nextToken()); // 정보 k개
                // 정보 가치 순으로 내림차순
                if(!infoMap.containsKey(name)) {
                    infoMap.put(name, new PriorityQueue<>(Collections.reverseOrder()));
                }
                PriorityQueue<Integer> pq = infoMap.get(name);
                for (int z = 0; z < k; z++) {
                    int num = Integer.parseInt(st.nextToken());
                    pq.add(num);
                }

            } else if (first.compareTo("2") == 0) {
                int b = Integer.parseInt(st.nextToken());

                if(!infoMap.containsKey(name)) continue;
                PriorityQueue<Integer> pq = infoMap.get(name);

                for (int j = 0; j < b; j++) {
                    if(infoMap.get(name).isEmpty()) break;
                    answer += pq.poll();
                }
            }
        }
        System.out.println(answer);
    }
}
