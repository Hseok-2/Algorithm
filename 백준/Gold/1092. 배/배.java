import java.util.*;
import java.io.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 크레인 개수
        // 각 크레인별 무게 제한 초기화
        ArrayList<Integer> craneList = listInit(N, br); // 각 크레인 무게 제한


        int M = Integer.parseInt(br.readLine()); // 박스 개수
        // 각 박스별 무게 제한 초기화
        ArrayList<Integer> boxList = listInit(M, br);

        // 내림차순 정렬
        craneList.sort(reverseOrder());
        boxList.sort(reverseOrder());

        int time = 0; // 최소 시간 변수

        if(craneList.get(0) < boxList.get(0)) {
            System.out.println(-1);
            return;
        }
        // 박스의 개수가 0일때 까지 반복
        while (!boxList.isEmpty()) {
            for (int i = 0; i < craneList.size(); i++) {

                for (int j = 0; j < boxList.size(); j++) {
                    // 현재 크레인이 현재 박스를 들 수 있다면
                    if(craneList.get(i) >= boxList.get(j)) {
                        boxList.remove(boxList.get(j));
                        break;
                    }
                }
            }
            time++;
        }
        System.out.println(time);
    }

    public static ArrayList<Integer> listInit(int n, BufferedReader br) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int weight = Integer.parseInt(st.nextToken());
            list.add(weight);
        }
        return list;
    }
}
