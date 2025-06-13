import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] numArr = new int[10]; // 나머지 값 저장
        int cnt = 0; // 서로 다른 나머지 값
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초기화
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < numArr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) cnt++;
        }
        System.out.println(cnt);

    }
}