import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(); // 결과값 모아서 출력

        // 상근이가 보유하고있는 카드 초기화
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int cardNum = Integer.parseInt(st.nextToken());
            hashMap.put(cardNum, hashMap.getOrDefault(cardNum, 0) + 1);
        }

        // 정수 M 입력
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            sb.append(hashMap.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
