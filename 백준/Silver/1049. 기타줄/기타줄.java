import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 끊어진 기타줄 개수
        int M = Integer.parseInt(st.nextToken()); // 브랜드 개수

        int[] minSingleArr = new int[M];
        int[] minPackageArr = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            minPackageArr[i] = Integer.parseInt(st.nextToken());
            minSingleArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(minPackageArr);
        Arrays.sort(minSingleArr);

        int minPackage = minPackageArr[0];
        int minSingle = minSingleArr[0];

        int costAllSingle = N * minSingle;
        int costMix = ((N / 6) * minPackage) + ((N % 6) * minSingle);
        int costAllPackage = (N%6==0) ? (N/6) * minPackage : (N/6+1) * minPackage;

        int answer = Math.min(costAllSingle, Math.min(costMix, costAllPackage));

        System.out.println(answer);
    }

}
