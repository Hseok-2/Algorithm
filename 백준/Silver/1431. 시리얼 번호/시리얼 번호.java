import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 시리얼 번호를 담을 배열 생성
        String[] serialNo = new String[N];
        // 배열 초기화
        for (int i = 0; i < serialNo.length; i++) {
            String str = br.readLine();
            serialNo[i] = str;
        }

        // 배열 커스텀 정렬
        Arrays.sort(serialNo, (s1, s2) -> {
            // 1. 길이가 같지않다면 짧은 순 정렬
            if(s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            // 2. 길이가 같다면 자리 수 합이 작은 순 정렬 (숫자만)
            int sum1 = getSum(s1);
            int sum2 = getSum(s2);
            if (sum1 != sum2) {
                return sum1 - sum2;
            }
            // 3. 사전순 정렬
            return s1.compareTo(s2);
        });

        for (String s : serialNo) {
            System.out.println(s);
        }
    }

    // 문자열의 모든 자리수 합을 구하는 메서드 (숫자만)
    public static int getSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int num = s.charAt(i) - '0';
                sum += num;
            }
        }
        return sum;
    }
}
