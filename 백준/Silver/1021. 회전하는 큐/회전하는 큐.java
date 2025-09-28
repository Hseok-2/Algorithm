import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

        // 1부터 N까지 queue 초기화
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        int minCount = 0; // 연산의 최솟값

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int targetNum = Integer.parseInt(st2.nextToken()); // 뽑아내려고하는 수의 위치
            // 인덱스 찾기
            int targetIndex = 0;
            for (int num : dq) {
                if (num == targetNum) {
                    break;
                }
                targetIndex++;
            }

            int leftCost = targetIndex; // 왼쪽으로 돌리는 비용
            int rightCost = dq.size() - targetIndex; // 오른쪽으로 돌리는 비용

            if(leftCost <= rightCost) { // 왼쪽으로 돌리는 비용이 더 적다면
                for (int j = 0; j < leftCost; j++) {
                    dq.addLast(dq.pollFirst()); // 2번 연산
                }
                minCount += leftCost;
            } else {
                for (int j = 0; j < rightCost; j++) {
                    dq.addFirst(dq.pollLast());
                }
                minCount += rightCost;
            }

            dq.pollFirst();
        }

        System.out.println(minCount);
    }
}
