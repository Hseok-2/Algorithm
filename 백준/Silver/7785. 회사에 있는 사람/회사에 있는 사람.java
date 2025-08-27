import java.io.*;
import java.util.*;

import static java.util.Collections.reverseOrder;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String,String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if(map.containsKey(name)) {
                map.remove(name);
            }else {
                map.put(name, status);
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, reverseOrder());

        for (String s : list) {
            System.out.println(s);
        }

    }
}
