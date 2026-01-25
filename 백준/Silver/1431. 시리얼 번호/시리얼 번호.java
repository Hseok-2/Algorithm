import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];
        for (int i = 0; i < str.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken();
        }

        Arrays.sort(str, (s1, s2) -> {
            if(s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }

            int sum1 = getSum(s1);
            int sum2 = getSum(s2);

            if (sum1 != sum2) {
                return sum1 - sum2;
            }

            return s1.compareTo(s2);
        });

        for (String s : str) {
            System.out.println(s);
        }
    }

    public static int getSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        };
        return sum;
    }
}
