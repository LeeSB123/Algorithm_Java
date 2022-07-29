package baekjoon;

import java.util.Scanner;

public class J10807 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] data = new int[N];
		int count = 0;
		
		for (int i = 0 ; i < N ; i++) {
			data[i] = scan.nextInt();
		}
		int v = scan.nextInt();
		
		for (int i = 0 ; i < N ; i++) {
			if ( data[i] == v ) count++;
		}
		
		System.out.println(count);
		scan.close();
	}
	
}
