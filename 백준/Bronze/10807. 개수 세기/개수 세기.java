import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0; // 주어진 num이 포함된 개수

        // 첫째 줄 정수의 개수
        int n = Integer.parseInt(br.readLine());

        // 입력받은 n의 길이만큼 배열 선언
        int[] arr = new int[n];

        // 둘째 줄 정수
        String[] input = br.readLine().split(" ");

        // 둘째 줄 정수의 요소를 배열에 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // 셋째 줄 정수
        int num = Integer.parseInt(br.readLine());

        // num이 몇개인지 카운트
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
