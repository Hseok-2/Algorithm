import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int[] num = new int[10];
        for (int i = 0; i < N.length(); i++) {
            int target = N.charAt(i) - '0';
            if(target == 9) target = 6;
            num[target]++;
        }
        num[6] = num[6]/2 + num[6]%2;

        int max = num[0];
        for (int n : num) {
            if(n > max) max = n;
        }

        System.out.println(max);
    }
}
