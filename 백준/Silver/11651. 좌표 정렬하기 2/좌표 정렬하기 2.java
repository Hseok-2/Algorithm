import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static class Location implements Comparable<Location>{
        int x,y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 오룸차순
        @Override
        public int compareTo(Location o) {
            if(this.y == o.y) {
                return Integer.compare(this.x, o.x);
            } else {
                return Integer.compare(this.y, o.y);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Location[] location = new Location[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            location[i] = new Location(x, y);
        }

        Arrays.sort(location);

        for (Location l : location) {
            sb.append(l.x).append(" ").append(l.y).append("\n");
        }

        System.out.println(sb.toString());
    }
}
