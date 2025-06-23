import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 사람 수
        int[] time = new int[N]; // 각 사람별 인출 시간
        int sum = 0; // 시간 합
        int total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 배열 초기화
        for (int i = 0; i < time.length; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        for (int i = 0; i < time.length - 1; i++) {
            for (int j = i + 1; j < time.length; j++) {
                int temp = 0;
                if (time[i] > time[j]) {
                    temp = time[i];
                    time[i] = time[j];
                    time[j] = temp;
                }
            }
        }

        // 합 계산
        for (int i = 0; i < time.length; i++) {
            sum += time[i]; // sum = sum + time[i]
            total += sum;
        }
        
        System.out.println(total);
    }
}
