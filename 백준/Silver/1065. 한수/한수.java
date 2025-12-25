import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력값이 있는지 확인 후 읽기
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            System.out.println(countHanSu(N));
        }
        sc.close();
    }

    public static int countHanSu(int n) {
        int cnt = 0;

        if (n < 100) {
            return n;
        } else {
            cnt = 99;
            if (n == 1000) {
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}