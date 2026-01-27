
import java.util.*;
import java.io.*;
import static java.util.Collections.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 크레인 개수

        // 각 크레인별 무게 제한 리스트
        ArrayList<Integer> craneList = listInit(N, br);

        int M = Integer.parseInt(br.readLine()); // 박스 개수
        // 각 상자별 무게 리스트
        ArrayList<Integer> boxList = listInit(M, br);

        // 크레인 리스트 내림차순 정렬
        craneList.sort(reverseOrder());
        // 박스 리스트 내림차순 정렬
        boxList.sort(reverseOrder());

        // 가장 무거운 박스가 크레인 무게제한보다 높다면 -1 출력
        if(boxList.get(0) > craneList.get(0)) {
            System.out.println(-1);
            return;
        }

        int time = 0; // 최소 시간
        while (!boxList.isEmpty()) {
            int boxIdx = 0; // 박스 인덱스
            int craneIdx = 0; // 크레인 인덱스

            while (craneIdx < N) {
                // 현재 크레인이 boxList 끝까지 순회해도 들 수 없다면 멈추고 다음 크레인으로
                if (boxIdx == boxList.size()) break;

                if(boxList.get(boxIdx) <= craneList.get(craneIdx)) { // 현재 크레인이 들 수 있는 박스 무게라면
                    boxList.remove(boxIdx); // 해당 박스 삭제 (최신화)
                    craneIdx++;
                } else {
                    boxIdx++; // 다음 박스로
                }
            }
            time++; // 한 턴 끝나면 1분 증가
        }

        System.out.println(time);
    }

    public static ArrayList<Integer> listInit(int num, BufferedReader br) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int weight = Integer.parseInt(st.nextToken());
            list.add(weight);
        }
        return list;
    }
}
