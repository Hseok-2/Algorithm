import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
        if(n == 0) {
			System.out.println(0);
			return;
		}
		for(int i=0; i<arr.length; i++) {
			if(i <= 1) {
				arr[i] = i;
			}else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		System.out.println(arr[n]);
	}

}
