import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 선수의 수
		sc.nextLine();
		
		int[] cnt = new int[26]; 
		
		for(int i=0; i<num; i++) {
			String name = sc.nextLine();
			cnt[name.charAt(0)-'a']++;
		}
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<26; i++) {
			if((int)cnt[i] >= 5) {
				result.append((char)(i + 'a'));
			}
		}
		
		if(result.length() > 0) {
			System.out.println(result);
		}else {
			System.out.println("PREDAJA");
		}
	}
}
