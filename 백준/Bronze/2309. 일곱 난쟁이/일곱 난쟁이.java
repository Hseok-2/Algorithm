import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] high = new int[9]; 
		int sum = 0;
		int a = 0;
		int b = 0;
		
		for(int i=0; i<high.length; i++) {
			high[i] = sc.nextInt();
			sum += high[i];
		}
		
		Arrays.sort(high);
		
		for(int i=0; i<high.length-1; i++) {
			for(int j=i+1; j<high.length; j++) {
				if(sum - high[i] - high[j] == 100) {
					a = i;
					b = j;
					break;
				}
			}
		}
		
		for(int i=0; i<high.length; i++) {
			if(i == a || i == b) continue;
			System.out.println(high[i]);
		}
	}

}
