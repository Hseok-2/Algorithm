import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numCnt = new int[10];

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String value = String.valueOf(a * b * c);

        for (int i = 0; i < value.length(); i++) {
            int index = value.charAt(i) - '0';
            numCnt[index]++;
        }

        for (int num : numCnt) {
            System.out.println(num);
        }
    }
}