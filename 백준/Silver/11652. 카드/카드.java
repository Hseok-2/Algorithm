import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> cards = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());
            cards.put(n, cards.getOrDefault(n, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        // list 변환 후 커스텀 정렬
        ArrayList<Long> list = new ArrayList<>(cards.keySet());
        list.sort(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                int a = cards.get(o1);
                int b = cards.get(o2);
                // 1. 가장 많이 가지고 있는 정수순으로 정렬
                if(a != b) {
                    return b-a;
                }
                // 2. 여러가지이면 숫자가 작은 것으로 정렬
                return o1.compareTo(o2);
            }
        });
        System.out.println(list.get(0));
    }
}
