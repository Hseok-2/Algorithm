import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine(); // 문자열 입력
        int M = Integer.parseInt(br.readLine()); // 명령어 개수

        LinkedList<Character> list = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        // 커서 이동 및 수정의 시간복잡도가 상수
        ListIterator<Character> iter = list.listIterator();

        // 초기 커서 위치는 맨뒤
        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            char ch = command.charAt(0);

            switch(ch) {
                case 'L':
                    if(iter.hasPrevious()) iter.previous();
                    break;

                case 'D':
                    if(iter.hasNext()) iter.next();
                    break;

                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;

                case 'P':
                    char ch2 = command.charAt(2);
                    iter.add(ch2);
                    break;

                default:
                    break;
            }
        }

        for (Character ch : list) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
