import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] tSize = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < tSize.length; i++) {
            tSize[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // T와 P가 공백으로 구분되어 주어짐
        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        // 첫 줄에 티셔츠 T장씩 최소 몇 묶음 주문해야하는지
        int tOrder = 0;
        for (int i = 0; i < tSize.length; i++) {
            tOrder += (tSize[i] + T - 1) / T; // 올림 나눗셈 구현
        }

        // 펜을 P자루씩 최대 몇 묶음 주문할 수 있는지와 그 때 펜을 한 자루씩 몇개 주문하는지
        int penBundle = N / P;
        int penSingle = N % P;

        System.out.println(tOrder);
        System.out.println(penBundle + " " + penSingle);
    }
}
