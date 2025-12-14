import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder sb = new StringBuilder();

        while(true) {
            str = br.readLine();
            int N = str.length();

            if(str.equals("*")) break;
            boolean flag = true;

            for (int i = 0; i < N - 1; i++) {

                HashSet<String> set = new HashSet<>();

                for (int j = 0; j + i + 1 < N; j++) {
                    String s1 = str.charAt(j)+"";
                    String s2 = str.charAt(j+i+1)+"";
                    String answer = s1 + s2;

                    if(set.contains(answer)) {
                        flag = false;
                        break;
                    }else {
                        set.add(answer);
                    }
                }
                if(!flag) break;
            }
            if(flag) {
                sb.append(str).append(" is surprising.").append("\n");
            }else {
                sb.append(str).append(" is NOT surprising.").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
