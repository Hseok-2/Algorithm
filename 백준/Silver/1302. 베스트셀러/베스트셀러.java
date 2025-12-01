import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> bookSales = new HashMap<>();

        // 책 판매량 초기화
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            bookSales.put(str, bookSales.getOrDefault(str, 0) + 1);
        }

        int maxSales = 0;
        String bestSeller = "";
        for (String key : bookSales.keySet()) {
            if (bookSales.get(key) > maxSales) {
                maxSales = bookSales.get(key);
                bestSeller = key;
            } else if (bookSales.get(key) == maxSales) {
                if(key.compareTo(bestSeller) < 0) {
                    bestSeller = key;
                }
            }
        }
        System.out.println(bestSeller);
    }
}
