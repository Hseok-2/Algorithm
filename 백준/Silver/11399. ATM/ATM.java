import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 사람 수
        int[] time = new int[N]; // 각 사람별 인출 시간

        StringTokenizer st = new StringTokenizer(br.readLine());
        arrayFill(time, st);

        // 오름차순 정렬
        Arrays.sort(time);

        // 출력
        System.out.println(getSum(time));
    }

    // 배열 초기화
    private static void arrayFill(int[] time, StringTokenizer st) {
        for (int i = 0; i < time.length; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }
    }

    // 합 계산
    static int getSum(int[] time) {
        int sum = 0; // 시간 합
        int total = 0;

        for (int i : time) {
            sum += i;
            total += sum;
        }

        return total;
    }
 }
