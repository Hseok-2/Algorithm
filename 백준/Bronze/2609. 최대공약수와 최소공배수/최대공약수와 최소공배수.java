import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = gcd(a,b); // 최대공약수
		
		System.out.println(d); // 최대공약수 출력
		System.out.println(a * b / d); // 최소공배수 출력
		
		
	}
	// 최대공약수
	public static int gcd(int a, int b) {
		
		while(b!=0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		return a;
	}

}
