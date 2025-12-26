import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 가져갈 나무의 길이

        // 나무 높이를 저장할 배열 생성
        int[] trees = new int[N];
        int min = 1; // 최소 높이
        int max = 0; // 최대 높이
        st = new StringTokenizer(br.readLine()); // 나무의 높이 한줄로 받음

        // 배열 초기화
        for (int i = 0; i < trees.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            trees[i] = n;
            max = Math.max(max, trees[i]);
        }

        while (min <= max) {
            int height = (min + max) / 2; // 이분탐색
            long sum = 0; // 높이 합산값

            for (int i = 0; i < trees.length; i++) {
                if(trees[i] - height >= 0) {
                    sum += (trees[i] - height);
                }
            }

            if (sum < M) {
                max = height - 1;
            }else {
                min = height + 1;
            }
        }
        System.out.println(max);
    }
}
