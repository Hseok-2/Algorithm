import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Counting Sort
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
