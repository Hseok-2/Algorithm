import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>(); // 상근이 카드
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        int[] input = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < input.length; i++) {
            if(set.contains(input[i])) {
                System.out.print(1 + " ");
            }else {
                System.out.print(0 + " ");
            }
        }

    }
}
