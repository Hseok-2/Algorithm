import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (!((H >= 0 && H <= 23) && (M >= 0 && M <= 59))) return;

        if (M < 45) {
            H--;
            if (H < 0) H = 23;
            M = M + 60 - 45;
        } else {
            M = M - 45;
        }

        System.out.println(H + " " + M);
    }
}