import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(recursive(num)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int recursive(int n) {
        if (n <= 3) {
            return arr[n];
        }
        if (arr[n] > 0) {
            return arr[n];
        }

        arr[n] = recursive(n - 1) + recursive(n - 2) + recursive(n - 3);
        return arr[n];
    }
}
