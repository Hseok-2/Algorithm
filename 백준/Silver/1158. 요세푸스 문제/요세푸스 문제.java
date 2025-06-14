import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //사람수
        int K = Integer.parseInt(st.nextToken()); //제거할 순번

        //1부터 N까지 초기화
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int idx = 0;
        while (!list.isEmpty()) {
            idx = (idx + K - 1) % list.size();
            sb.append(list.remove(idx));
            if(!list.isEmpty()) sb.append(", ");
        }

        sb.append(">");
        System.out.println(sb);
    }
}
