import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;

        char[] dna = br.readLine().toCharArray();

        int[] minCount = new int[4];      // {A, C, G, T} 최소 개수
        int[] currentCount = new int[4];  // 현재 윈도우의 문자 개수

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            minCount[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 첫 번째 윈도우 설정
        for (int i = 0; i < P; i++) {
            add(dna[i], currentCount);
        }

        if (check(minCount, currentCount)) {
            result++;
        }

        // 2. 슬라이딩 윈도우 시작
        for (int i = P; i < S; i++) {
            int j = i - P; // 윈도우의 맨 왼쪽 인덱스

            // 오른쪽 문자 추가
            add(dna[i], currentCount);
            // 왼쪽 문자 제거
            remove(dna[j], currentCount);

            if (check(minCount, currentCount)) {
                result++;
            }
        }

        System.out.println(result);
    }

    // 문자 추가
    private static void add(char c, int[] currentCount) {
        switch (c) {
            case 'A': currentCount[0]++; break;
            case 'C': currentCount[1]++; break;
            case 'G': currentCount[2]++; break;
            case 'T': currentCount[3]++; break;
        }
    }

    // 문자 제거
    private static void remove(char c, int[] currentCount) {
        switch (c) {
            case 'A': currentCount[0]--; break;
            case 'C': currentCount[1]--; break;
            case 'G': currentCount[2]--; break;
            case 'T': currentCount[3]--; break;
        }
    }

    // 조건
    private static boolean check(int[] minCount, int[] currentCount) {
        for (int i = 0; i < 4; i++) {
            if (currentCount[i] < minCount[i]) {
                return false;
            }
        }
        return true;
    }
}
