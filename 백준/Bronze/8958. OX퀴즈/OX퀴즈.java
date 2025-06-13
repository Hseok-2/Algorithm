import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int k=0;

        while (n-- > 0) {
            String input = br.readLine();

            int sum = 0;
            int total = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'O') {
                    sum++;
                    total += sum;
                } else {
                    sum = 0;
                }
            }
            arr[k] = total;
            k++;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
