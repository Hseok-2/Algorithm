import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentPeople = 0; // 현재 기차 안에 있는 사람 수
		int maxPeople = 0; // 사람 가장 많을 때의 수
		
		int i = 0;
		while(i < 10) {
			int out = 0; // 내린사람
			int in = 0; // 탄사람
			out = sc.nextInt();
			in = sc.nextInt();
			
			currentPeople += - out + in;
			if(maxPeople < currentPeople) maxPeople = currentPeople;
			i++;
		}
		System.out.println(maxPeople);
	}

}
