import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수열 크기 입력받기

        int[] numArr = new int[N]; // 길이가 N인 수열
        StringTokenizer st = new StringTokenizer(br.readLine()); // 수열에 포함되는 수 한 줄에 입력받기
        for (int i = 0; i < numArr.length; i++) { // 수열 초기화
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine()); // x값 입력받기
        HashSet<Integer> set = new HashSet<>();

        int count = 0;

        for (int num : numArr) {
            if(set.contains(x - num)) {
                count++;
            }
            set.add(num);
        }

        System.out.println(count);
    }
}
