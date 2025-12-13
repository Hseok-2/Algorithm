import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> name = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        ArrayList<String> answer = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < N + M; i++) {
            String str = br.readLine();
            if(name.contains(str)) {
                answer.add(str);
                cnt++;
            }
            name.add(str);
        }
        Collections.sort(answer);
        for (String n : answer) {
            sb.append(n).append("\n");
        }

        System.out.println(cnt);
        System.out.println(sb.toString());
    }
}
