package baekjoon;

// 포인트 카드 
import java.util.Scanner;

public class J14471 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		int count = 0;
		int sum[];
		
		for (int i = 0 ; i < M ; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			
		}
		
		for (int i = 0 ; i < M ; i++) {
			if (a[i] >= N) {
				count++;
			} else {
				
			}
		}
	}
}