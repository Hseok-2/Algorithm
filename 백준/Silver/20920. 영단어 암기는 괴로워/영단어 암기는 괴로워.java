import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 단어 개수
        int M = Integer.parseInt(st.nextToken()); // 단어 길이 제한

        HashMap<String, Integer> words = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length() < M) continue; // M보다 작으면 패스

            words.put(str, words.getOrDefault(str, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>(words.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = words.get(o1);
                int b = words.get(o2);

                if(a != b) {
                    return b - a;
                }

                if(o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                return o1.compareTo(o2);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
