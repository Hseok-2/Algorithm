import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int answer = -1;

        for (int i = N/5; i>=0; i--) {
            int remain = N - (5 * i);
            if (remain % 3 == 0) {
                int k = remain / 3;
                answer = i + k;
                break;
            }
        }
        return answer;
    }
}
