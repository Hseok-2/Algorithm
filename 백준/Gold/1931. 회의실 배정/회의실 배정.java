import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 회의실 수

        int[][] meetings = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        // 끝나는 시간 기준으로 오름차순 정렬, 종료 시간이 같다면 시작 시간이 낮은 순으로 정렬
        Arrays.sort(meetings, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });

        int maxMeetings = 1; // 최대 회의 수
        int prevEndTime = meetings[0][1];
        for (int i = 1; i < N; i++) {
            if(prevEndTime <= meetings[i][0]) {
                maxMeetings++;
                prevEndTime = meetings[i][1];
            }
        }
        System.out.println(maxMeetings);
    }
}
