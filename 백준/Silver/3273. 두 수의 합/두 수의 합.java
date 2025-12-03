import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int x = Integer.parseInt(br.readLine()); // x값 입력받기

        List<Integer> tempSet = new ArrayList<>(set);
        Collections.sort(tempSet); // 오름차순 정렬

        int start = 0;
        int end = N-1;
        int count = 0;

        while (start < end) {
            if(tempSet.get(start) + tempSet.get(end) > x) {
                end--;
            } else if(tempSet.get(start) + tempSet.get(end) < x) {
                start++;
            } else {
                start++;
                end--;
                count++;
            }
        }

        System.out.println(count);
    }
}
