import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려는 사이트의 수

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String url = st.nextToken();
            String pwd = st.nextToken();
            map.put(url, pwd);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String findPwd = br.readLine();
            
            if (map.containsKey(findPwd))
                sb.append(map.get(findPwd)).append("\n");
            
        }

        System.out.println(sb.toString());
    }
}
