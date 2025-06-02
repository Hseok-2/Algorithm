import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int sum = 0; // 9권 합
        int price = 0; // 가격
        int total = 0; // 9권 가격
        int n = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        total = Integer.parseInt(br.readLine());

        while (n < 9) {
            price = Integer.parseInt(br.readLine());
            sum += price;
            n++;
        }

        System.out.println(total - sum);
    }
}