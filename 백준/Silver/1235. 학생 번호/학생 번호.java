import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 학생 수 입력 받기

        String[] students = new String[N];

        // 각 학생 고유 번호 초기화
        for (int i = 0; i < students.length; i++) {
            students[i] = br.readLine();
        }

        int len = students[0].length();

        for (int k = 1; k <= len; k++) {

            HashSet<String> set = new HashSet<>();

            for (int i = 0; i < students.length; i++) {
                set.add(students[i].substring(len-k));
            }

            // 중복이 없다면 최소 k값
            if (set.size() == N) {
                System.out.println(k);
                return;
            }
        }
    }
}
