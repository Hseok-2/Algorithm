import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 정수를 저장하는 스택 생성
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // N만큼 while문 실행
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch(str) {
                case "1":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "2":
                    if(!stack.isEmpty()) {
                        int num = stack.pop();
                        System.out.println(num);
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "3":
                    System.out.println(stack.size());
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "5":
                    if(!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    }else {
                        System.out.println(-1);
                    }
            }
        }
    }
}
