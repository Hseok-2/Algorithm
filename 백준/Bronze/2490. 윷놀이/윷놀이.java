import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 3;

        char[] yutNori = {'E', 'A', 'B', 'C', 'D'};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str;
            for (int j = 0; j < 4; j++) {
                str = st.nextToken();
                if(str.equals("0")) count++;
            }
            sb.append(yutNori[count]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
