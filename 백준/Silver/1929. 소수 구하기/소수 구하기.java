import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] inputs = br.readLine().split(" ");
        int M = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
