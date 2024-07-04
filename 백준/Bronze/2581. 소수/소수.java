import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); // 입력받을 자연수 
		int N = sc.nextInt(); // 입력받을 자연수
		int sum = 0; // 소수 합계
		
		ArrayList<Integer> al = findPrime(M, N);
		
		if(al.isEmpty()) {
			System.out.println(-1);
		}else {
			for(int i=0; i<al.size(); i++) {
				sum += al.get(i);
			}
			System.out.println(sum);
			System.out.println(al.get(0));
		}
	}
	
	// M~N까지 소수를 찾는 함수 
	public static ArrayList<Integer> findPrime(int M, int N) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) {
				al.add(i);
			}
		}
		return al;
	}
	
	// 소수 판별 함수
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
