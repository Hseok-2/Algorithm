import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 넷이 놀기
 * 2121번
 */
public class Main {

    public static class Point implements Comparable<Point> {
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            // x가 작은 순으로 정렬
            if (this.x != o.x) {
                return this.x - o.x;
            }
            // x가 같다면 y가 작은 순으로 정렬
            return this.y-o.y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }

        Collections.sort(list);
        
        int count = 0;

        for (Point p : list) {
            // 현재 p를 좌측 상단으로 가정
            Point p2 = new Point(p.x + A, p.y); // 우측 상단
            Point p3 = new Point(p.x, p.y + B); // 좌측 하단
            Point p4 = new Point(p.x + A, p.y + B); // 우측 하단
            
            // p ~ p4까지의 모든 점들이 list에 있는지 확인
            if(Collections.binarySearch(list, p2) >= 0 &&
                Collections.binarySearch(list, p3) >= 0 &&
                Collections.binarySearch(list, p4) >= 0) {
                count++; // 있다면 +1
            }
        }

        System.out.println(count);
    }
}
