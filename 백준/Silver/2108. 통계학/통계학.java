import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N];
        arr = init(br, N);

        // 오름차순 정렬
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        sb.append(mean(N)).append("\n");
        sb.append(median(N)).append("\n");
        sb.append(mode(N)).append("\n");
        sb.append(maxMinDiff(N)).append("\n");

        System.out.println(sb.toString());
    }

    public static int[] init(BufferedReader br, int n) throws IOException {
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        return arr;
    }

    // 산술평균
    public static int mean(int n) {
        int sum = 0;
        int answer = 0;
        for (int num : arr) {
            sum += num;
        }

        return (int)Math.round(((double)sum /n));
    }

    // 중앙값
    public static int median(int n) {
        return arr[n / 2];
    }

    // 최빈값
    public static int mode(int n) {
        int[] num = new int[8001];
        for (int i = 0; i < n; i++) {
            num[arr[i] + 4000]++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i : num) {
            if(i > max) max = i;
        }

        for(int i=0; i<num.length; i++) {
            if(num[i] == max) list.add(i-4000);
        }

        Collections.sort(list);

        if(list.size() > 1) {
            return list.get(1);
        }else {
            return list.get(0);
        }
    }

    // 범위
    public static int maxMinDiff(int n) {
        return arr[n-1] - arr[0];
    }
}
