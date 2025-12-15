import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            LinkedList<Character> list = new LinkedList<>();

            ListIterator<Character> iter = list.listIterator();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                switch(ch) {
                    case '<':
                        if (iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case '>':
                        if (iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case '-':
                        if (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default:
                        iter.add(ch);
                        break;
                }
            }
            for (char c : list) {
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }
}
