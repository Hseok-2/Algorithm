import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int max = -1; // 최대값
        int n = 0; // 몇번째인지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                n = i+1;
            }
        }
        System.out.println(max);
        System.out.println(n);
    }
}