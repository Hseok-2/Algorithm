import java.io.*;
import java.util.*;

/**
 * LinkedHashMap
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // list 변환 후 정렬 로직
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int mapA = map.get(a);
                int mapB = map.get(b);

                return mapB - mapA;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int n : list) {
            int size = map.get(n);
            while(size-- > 0) {
                sb.append(n).append(" ");
            }
        }

        System.out.println(sb);
    }
}
