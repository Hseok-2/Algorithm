import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 배열의 길이 입력

        int minSum = 0; // 최소값

        // 배열A, B 초기화
        int[] A = initArray(N, br);
        int[] B = initArray(N, br);

        // ArrayList 생성
        ArrayList<Integer> listA = list(A);
        ArrayList<Integer> listB = list(B);

        Collections.sort(listA); // listA 오름차순
        listB.sort(Collections.reverseOrder()); // listB 내림차순

        for(int i=0; i<N; i++) {
            minSum += listA.get(i) * listB.get(i);
        }

        System.out.println(minSum);
    }

    // 배열 초기화 메서드
    public static int[] initArray(int n, BufferedReader br) throws IOException {
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    // ArrayList 선언하고 배열 원소값 복사
    public static ArrayList<Integer> list(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : arr) {
            list.add(n);
        }
        return list;
    }

}
