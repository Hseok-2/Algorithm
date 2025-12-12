import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int x;
            switch(str) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    if(set.contains(x)) {
                        sb.append("1").append("\n");
                    }else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if(set.contains(x)){
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    set.clear();
                    for(int i=0; i<20; i++) {
                        set.add(i + 1);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
