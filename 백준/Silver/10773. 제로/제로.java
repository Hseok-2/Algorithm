import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                if(!dq.isEmpty()) {
                    int popNum = dq.pop();
                    sum -= popNum;
                }
            }else {
                dq.push(num);
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
