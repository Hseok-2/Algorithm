import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 수의 개수 N
		int sum = 0; // 합계 
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt(); // 주어진 수
			boolean isPrime = true;
			
			if(num <= 1) {
				isPrime = false;
			}else {
				for(int j=2; j<num; j++) {
					if(num % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			if(isPrime) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
