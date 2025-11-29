import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a_length = Integer.parseInt(st.nextToken());
        int b_length = Integer.parseInt(st.nextToken());

        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a_length; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b_length; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;
        for (int num : B) {
            if (A.contains(num)) cnt++;
        }

        System.out.println(A.size()-cnt + B.size()-cnt);
    }
}
