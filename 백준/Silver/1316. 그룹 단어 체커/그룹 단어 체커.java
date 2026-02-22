import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 단어의 개수

        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        int count = 0;
        for (int i = 0; i < str.length; i++) {
            HashSet<Character> chSet = new HashSet<>();
            boolean isFlag = true;
            for (int j = 0; j < str[i].length() - 1; j++) {
                char ch = str[i].charAt(j);
                chSet.add(ch);

                if(ch != str[i].charAt(j+1)) {
                    if(chSet.contains(str[i].charAt(j+1))) {
                        isFlag = false;
                        break;
                    }
                }
            }
            if(isFlag) count++;
        }

        System.out.println(count);
    }
}
