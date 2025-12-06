import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        double[] record = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < record.length; i++) {
            record[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(record);
        double M = record[N - 1]; // 최대값

        double sum = 0.0; // 새로운 점수인 각 원소들의 합
        for (int i = 0; i < record.length; i++) {
            record[i] = Math.round(record[i] / M * 100 * 100) / 100.0;
            sum += record[i];
        }

        System.out.println(sum / N);
    }
}
