package baekjoon;

// 가위 바위 보 
import java.util.Scanner;

public class j2930 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int R = scan.nextInt();
		int N = 0;
		String sangeun[] = new String[R];
		String count[] = new String[N];
		
		for (int i = 0 ; i < R ; i++) {
			sangeun[i] = scan.next();
		}
		N = scan.nextInt();
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < R ; j++) {
				count[j] = scan.next();
				
			}
			System.out.print("\n");
		}
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < R ; j++) {
				
			}
			
		}
		
	}
}
