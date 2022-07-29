package baekjoon;

import java.util.Scanner;

public class J2475 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] data = new int[5];
		int sum = 0;
		
		for (int i = 0 ; i < data.length ; i++) {
			data[i] = scan.nextInt();
			data[i] *= data[i];
			sum += data[i];
		}
		
		System.out.println(sum % 10);
		
	}
	
}
