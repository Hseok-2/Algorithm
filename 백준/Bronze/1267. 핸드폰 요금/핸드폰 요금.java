import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 통화 개수
		int[] s = new int[n];
		int y=0; // 영식 요금제
		int m=0; // 민식 요금제
		
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			y += (s[i]/30+1) * 10;
			m += (s[i]/60+1) * 15;
		}
		String result = y<m? "Y "+y : (y==m? "Y M "+y : "M "+m);  
		
		System.out.println(result);
    }
}