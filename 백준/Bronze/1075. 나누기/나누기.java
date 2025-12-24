import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int tempN = (N / 100) * 100;

        for (int i = 0; i < 100; i++) {
            if ((tempN + i) % F == 0) {
                System.out.printf("%02d", i);
                break;
            }
        }
    }
}