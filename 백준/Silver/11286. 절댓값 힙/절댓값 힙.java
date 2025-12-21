import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<HeapAbs> q = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            int xAbs = Math.abs(x);

            if (x == 0) {
                if (q.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    // 절댓값이 가장 작은 값 출력 후 해당 값을 배열에서 제거
                    HeapAbs a = q.poll();
                    int min = a.x;

                    sb.append(min).append("\n");
                }
            } else {
                q.add(new HeapAbs(x, xAbs));
            }
        }
        System.out.println(sb.toString());
    }

    static class HeapAbs implements Comparable<HeapAbs> {

        int x, absNum;

        public HeapAbs(int x, int absNum) {
            this.x = x;
            this.absNum = absNum;
        }

        @Override
        public int compareTo(HeapAbs o1) {

            if (this.absNum == o1.absNum) {
                return Integer.compare(this.x, o1.x);
            } else {
                return Integer.compare(this.absNum, o1.absNum);
            }
        }
    }


}

