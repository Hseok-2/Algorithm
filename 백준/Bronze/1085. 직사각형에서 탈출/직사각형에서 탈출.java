import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int answer = solution(x,y,w,h);
        
        System.out.println(answer);
    }
     public static int solution(int x, int y, int w, int h) {
        int min = 0;
		//x를 기준으로 좌우 비교
        min = Math.abs(x-w) < x? Math.abs(x-w):x;
        
		//y를 기준으로 상하 비교, 또한 x에서 구한 최솟값과 비교
        min = Math.abs(y-h) < y && Math.abs(y-h) < min ? Math.abs(y-h) : (y < min? y : min );

        return min;
	 }
}