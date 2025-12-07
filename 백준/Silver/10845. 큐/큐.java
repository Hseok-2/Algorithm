import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static ArrayDeque<Integer> q = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str) {
                case "push" :
                    int x = Integer.parseInt(st.nextToken());
                    q.add(x);
                    break;
                case "pop":
                    if(!q.isEmpty()) {
                        int num = q.poll();
                        sb.append(num).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty()) {
                        sb.append(1).append("\n");
                    }else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if(q.isEmpty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(q.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(q.peekLast()).append("\n");
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb.toString());
    }

}
