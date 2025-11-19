import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s=0,e=0,sum=0,cnt=0;
        
        while (true) {
            if(sum >= M) {
                sum -= arr[s++];
            }else if(e == N) break;
            else {
                sum += arr[e++];
            }

            if(sum == M) cnt++;
        }

        System.out.println(cnt);
    }
}
