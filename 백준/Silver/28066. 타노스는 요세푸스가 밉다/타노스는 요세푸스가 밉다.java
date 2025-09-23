import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // N 마리 청설모
        int K = Integer.parseInt(st.nextToken()); // K 마리 청설모 선택 숫자

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            dq.addLast(i);
        }
        while(dq.size() > 1) { // 청설모가 1마리 남을때 까지 반복
            // 남아있는 청설모가 K마리보다 적으면 첫 번째 청설모를 제외한 모든 청설모 제거
            if (dq.size() < K) {
                int firstNum = dq.pollFirst();
                dq.clear();
                dq.addLast(firstNum);
            }

            // 첫 번째 청설모 저장
            int top = dq.pollFirst();

            for (int i = 1; i < K; i++) {
                dq.pollFirst();
            }

            // 첫 번째 청설모를 맨 뒤 저장
            dq.addLast(top);
        }

        System.out.println(dq.peek());
    }
}
