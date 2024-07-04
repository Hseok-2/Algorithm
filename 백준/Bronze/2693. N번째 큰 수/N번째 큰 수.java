import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] result = new int[t]; // 각 배열의 3번째 큰 수를 저장할 배열 생성
		
		for(int i=0; i<t; i++) {
			int[] arr = new int[10];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			result[i] = arr[arr.length - 3];
		}
		for(int i:result) {
			System.out.println(i);
		}
	}
	
}
