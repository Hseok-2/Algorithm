import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> dq = new ArrayDeque<>(); // [0]-인덱스, [1]-높이

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int currentHeight = Integer.parseInt(st.nextToken());

            while (!dq.isEmpty()) {
                if(dq.peek()[1] >= currentHeight) { // top이 높다면 레이저 수신 가능
                    sb.append(dq.peek()[0]).append(" ");
                    break;
                }
                dq.pop(); // 그렇지 않으면 pop (레이저 수신 불가)
            }

            if (dq.isEmpty()) {
                sb.append("0 ");
            }

            dq.push(new int[] {i, currentHeight});
        }

        System.out.println(sb.toString());
    }
}
