import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 올바른 체스
		int[] arr = {1,1,2,2,2,8};
		
		String line = br.readLine();
		String[] input = line.split(" ");
		
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<arr.length; i++) {
			int n = Integer.valueOf(input[i]);
			result.append(arr[i] - n).append(" ");
		}
		
		System.out.println(result.toString().trim());
	}
}
