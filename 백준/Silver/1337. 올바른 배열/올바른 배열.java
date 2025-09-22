import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N == 0) {
            System.out.println(5);
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 배열 오름차순 정렬
        Arrays.sort(arr);

        int maxCnt = 1; // 배열에 최소 1개 원소를 가지고있으므로 최소 개수 1

        for (int i = 0; i < N; i++) {
            int currentCnt = 1;
            for (int j = i + 1; j < N; j++) {
                if(arr[j] <= arr[i] + 4) {
                    currentCnt++;
                }else {
                    break;
                }
            }
            if (currentCnt > maxCnt) {
                maxCnt = currentCnt;
            }
        }
        System.out.println(5-maxCnt);
    }
}
