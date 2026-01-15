import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * ArrayDeque 활용
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        // T만큼 반복
        for (int i = 0; i < T; i++) {
            // 함수 입력받기
            String function = br.readLine();

            // 길이 입력받고 초기화
            int len = Integer.parseInt(br.readLine());
            ArrayDeque<Integer> dq = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],",false);

            for (int k = 0; k < len; k++) {
                int n = Integer.parseInt(st.nextToken());
                dq.add(n);
            }

            // 함수 문자열 길이만큼 반복
            boolean isReverse = false;
            boolean isError = false;
            for (int j = 0; j < function.length(); j++) {
                char ch = function.charAt(j);

                // 뒤집기
                if(ch == 'R') {
                    isReverse = !isReverse;
                } else if (ch == 'D') { // 첫 번째 수 버림
                    if(dq.isEmpty()) {
                        isError = true;
                        break;
                    }

                    if (isReverse) {
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                }
            }
            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("[");
                if(!dq.isEmpty()) {
                    if(isReverse) { // 역방향이면
                        sb.append(dq.pollLast());
                        while (!dq.isEmpty()) {
                            sb.append(",").append(dq.pollLast());
                        }
                    } else {
                        sb.append(dq.pollFirst());
                        while (!dq.isEmpty()) {
                            sb.append(",").append(dq.pollFirst());
                        }
                    }
                }
                sb.append("]\n");
            }
        }
        System.out.println(sb.toString());
    }
}
