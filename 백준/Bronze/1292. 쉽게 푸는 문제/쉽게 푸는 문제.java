import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 시작 구간
		int b = sc.nextInt(); // 끝 구간
		int sum = 0; // 합
		int currentNum = 1; // 현재 수열에서 사용되고 있는 숫자
		int currentCnt = 0; // 해당 숫자가 얼마나 사용되었는지 카운트
		
		for(int i=1; i<=b; i++) {
			if(i >= a) {
				sum += currentNum;
			}
			currentCnt++;
			if(currentCnt == currentNum) {
				currentNum++;
				currentCnt = 0;
			}
		}
		System.out.println(sum);
	}
}
