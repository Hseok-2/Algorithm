import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        // q 초기화
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (q.size() != 1) {
            q.poll();
            if(!q.isEmpty()) {
                q.add(q.poll());
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(q.peek());
        System.out.println(sb.toString());
    }
}
