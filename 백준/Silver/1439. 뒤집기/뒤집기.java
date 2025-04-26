import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count_to_all_zero = 0;
        int count_to_all_one = 0;

        // 입력된 숫자를 int 배열로 전환
        String input = br.readLine();
        int[] arr = new int[input.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.charAt(i) - '0';
        }

        // 입력된 첫번째 숫자가 0인지 1인지 판별 후 카운트
        if (arr[0] == 0) {
            count_to_all_one++;
        }
        if (arr[0] == 1) {
            count_to_all_zero++;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                if (arr[i+1] == 0) {
                    count_to_all_one += 1;
                }
                if (arr[i + 1] == 1) {
                    count_to_all_zero += 1;
                }
            }
        }

        System.out.println(Math.min(count_to_all_one, count_to_all_zero));
    }
}
