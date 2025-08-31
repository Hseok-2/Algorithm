import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 우선순위 큐 선언
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if (q.isEmpty()) {
                    System.out.println(0);
                } else { // x가 0이라면 가장 작은 값 출력 후 queue에서 삭제
                    System.out.println(q.poll());
                }
            } else {
                q.add(x);
            }
        }
    }

}
