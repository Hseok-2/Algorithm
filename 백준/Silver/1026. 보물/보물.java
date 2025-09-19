import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 배열의 길이 입력

        int minSum = 0; // 최소값

        // 배열A, B 초기화
        int[] A = initArr(N, br);
        int[] B = initArr(N, br);

        // 배열 A 오름차순 정렬
        Arrays.sort(A);

        ArrayList<Integer> arrB = new ArrayList<>();
        for(int n : B) {
            arrB.add(n);
        }

        for (int i = 0; i < N; i++) {
            int max = Collections.max(arrB);
            minSum += A[i] * max;
            arrB.remove(Integer.valueOf(max));
        }

        System.out.println(minSum);
    }

    public static int[] initArr(int num, BufferedReader br) throws IOException {
        int[] array = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        return array;
    }
}
