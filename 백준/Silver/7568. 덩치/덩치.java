import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] physical = new int[N][2];
        for (int i = 0; i < physical.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < physical[i].length; j++) {
                physical[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < physical.length; i++) {
            int rank = 1;
            for (int j = 0; j < physical.length; j++) {
                if(physical[i][0] < physical[j][0] && physical[i][1] < physical[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb.toString());
    }
}
