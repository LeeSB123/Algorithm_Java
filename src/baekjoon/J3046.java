package baekjoon;

import java.util.Scanner;

public class J3046 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		int R1 = scan.nextInt();
		int S = scan.nextInt();
		
		int R2 = (S * 2) - R1;
		System.out.println(R2);
		scan.close();
		
	}
	
}
