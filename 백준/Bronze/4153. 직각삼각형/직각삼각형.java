import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            max = Math.max(a, Math.max(b,c));

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (((a * a) + (b * b) + (c * c) - (max * max)) != (max * max)) {
                System.out.println("wrong");
            } else {
                System.out.println("right");
            }
        }
    }
}
