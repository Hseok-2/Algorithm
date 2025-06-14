
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] num = new int[26]; // 알파벳 배열 선언

        // 알파벳 배열 -1로 초기화
        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int index = ch - 'a';

            if (num[index] == -1) {
                num[index] = i;
            }
        }

        for (int idx : num) {
            System.out.print(idx + " ");
        }
    }
}
