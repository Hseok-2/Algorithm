import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 운동 N분 
		int m = Integer.parseInt(st.nextToken()); // 초기 맥박 수
		int M = Integer.parseInt(st.nextToken()); // 최대 맥박 수(Max)
		int T = Integer.parseInt(st.nextToken()); // 운동 후 맥박 증가량  
		int R = Integer.parseInt(st.nextToken()); // 휴식 후 맥박 감소량
		int X = m; // 현재 맥박 수
		int min = 0; // 최솟값
		
		if(M-m < T) {
			System.out.println(-1);
			return;
		}
		
		while(N > 0) {
			if((X + T) <= M) { // 운동이 가능한 경우
				X += T;
				N--;
			}else { // 휴식을 취해야 하는 경우
				X = Math.max(X-R, m);
			}
			min++;
		}
		System.out.println(min);
	}
}
