import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            HashMap<Long, Integer> armyNo = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int ti = Integer.parseInt(st.nextToken());

            for (int j = 0; j < ti; j++) { // HashMap 초기화
                long num = Long.parseLong(st.nextToken());
                armyNo.put(num, armyNo.getOrDefault(num, 0) + 1);
            }
            boolean flag = false;
            for (long num : armyNo.keySet()) {
                if(armyNo.get(num) > (ti/2)) {
                    sb.append(num).append("\n");
                    flag = true;
                    break;
                }
            }
            if(!flag) sb.append("SYJKGW").append("\n");

        }

        System.out.println(sb.toString());
    }
}
