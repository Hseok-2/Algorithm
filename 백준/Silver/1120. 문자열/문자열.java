import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int minNum = Integer.MAX_VALUE;
        int len = B.length() - A.length();

        for (int start = 0; start <= len; start++) {
            int countDiff = 0;

            for (int i = 0; i < A.length(); i++) {

                if (A.charAt(i) != B.charAt(i + start)) {
                    countDiff++;
                }
            }
            minNum = Math.min(minNum, countDiff);
        }

        System.out.println(minNum);
    }
}
