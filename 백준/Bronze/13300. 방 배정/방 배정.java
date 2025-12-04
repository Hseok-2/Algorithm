import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int K = Integer.parseInt(st.nextToken()); // 한 방에 배정되는 최대 인원 수

        HashMap<Integer, HashMap<Integer, Integer>> info = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int grade = Integer.parseInt(st.nextToken()); // 학년
            int gender = Integer.parseInt(st.nextToken()); // 성별

            if(!info.containsKey(grade)) {
                info.put(grade, new HashMap<>());
            }

            HashMap<Integer, Integer> innerMap = info.get(grade);

            innerMap.put(gender, innerMap.getOrDefault(gender, 0)+1);
        }

        int count = 0; // 최소 방 개수

        for (int key : info.keySet()) {
            HashMap<Integer, Integer> map = info.get(key);
            for (int n : map.keySet()) {
                int students = map.get(n);
                if(students % K == 0) {
                    count += students / K;
                } else {
                    count += students / K + 1;
                }
            }
        }

        System.out.println(count);
    }
}
