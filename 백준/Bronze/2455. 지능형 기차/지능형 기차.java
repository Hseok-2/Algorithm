import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minus = 0; // 내린사람
		int plus = 0; // 탄사람
		int current = 0; // 현재 기차안에 있는 사람 수
		int max = 0; // 최대 사람 수

		for(int i=0; i<4; i++) {
			minus = sc.nextInt();
			plus = sc.nextInt();
			
			current = current - minus + plus; 
			
			if(current > max) {
				max = current;
			}
		}
		System.out.println(max);
	}
}
