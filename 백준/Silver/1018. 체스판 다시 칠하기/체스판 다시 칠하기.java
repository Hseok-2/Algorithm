import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if(str.charAt(j) == 'W') {
                    board[i][j] = true;
                }else {
                    board[i][j] = false;
                }
            }
        }

        int rowRange = N - 7;
        int colRange = M - 7;

        for (int i = 0; i < rowRange; i++) {
            for (int j = 0; j < colRange; j++) {
                minCost(i, j);
            }
        }
        System.out.println(min);
    }

    public static void minCost(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                boolean flag;
                // 짝수는 true, 홀수는 false
                if((i+j)%2 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }

                if(board[i][j] != flag) {
                    count++;
                }
            }
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
