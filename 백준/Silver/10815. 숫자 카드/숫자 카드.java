import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = getCards(br);
        int[] input = getInput(br);

        System.out.println(result(set, input));
    }

     private static HashSet<Integer> getCards(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>(); // 상근이 카드
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        return set;
    }

    private static int[] getInput(BufferedReader br) throws IOException {
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] input = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        return input;
    }

    private static String result(HashSet<Integer> set, int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int num : arr) {
            sb.append(set.contains(num) ? "1 " : "0 ");
        }
        return sb.toString().trim();
    }
}
