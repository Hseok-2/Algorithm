import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 주어진 수
		int K = sc.nextInt(); // N의 약수 중 K번째로 작은 수
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			if(N%i == 0) {
				al.add(i);
			}
		}
		if(al.size() < K) {
			System.out.println(0);
		}else {
			System.out.println(al.get(K-1));
		}
    }
}