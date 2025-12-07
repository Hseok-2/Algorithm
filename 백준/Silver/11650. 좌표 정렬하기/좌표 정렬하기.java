import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Coordinate[] nates = new Coordinate[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            nates[i] = new Coordinate(x, y);
        }
        
        Arrays.sort(nates, (o1, o2) -> {
            if(o1.x == o2.x) {
                return o1.y - o2.y;
            } else {
                return o1.x - o2.x;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Coordinate c : nates) {
            sb.append(c.x).append(" ").append(c.y).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Coordinate {
        int x;
        int y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
