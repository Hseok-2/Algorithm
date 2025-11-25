import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // [N][2] 크기의 2차원 배열 생성 {값, 인덱스}
        int[][] arr = new int[N][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken()); // 값
            arr[i][1] = i; // 원래 인덱스
        }
        
        // 정렬
        Arrays.sort(arr, (o1, o2) -> {
            // 값이 같으면 인덱스 오름차순
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            // 값이 다르면 값 오름차순
            return Integer.compare(o1[0], o2[0]);
        });
        
        // 배열 P
        int[] P = new int[N];
        for(int rank=0; rank<N; rank++) {
            int originalIdx = arr[rank][1]; // 정렬된 상태에서 원래 인덱스를 꺼냄
            P[originalIdx] = rank; // 그 위치에 등수(rank) 기록
        }
        
        StringBuilder sb = new StringBuilder();
        for(int p : P) sb.append(p).append(" ");
        System.out.println(sb);
    }
}