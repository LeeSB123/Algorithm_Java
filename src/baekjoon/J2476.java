package baekjoon;

import java.util.Scanner;

public class J2476 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		int person = scan.nextInt();
		int a, b, c;
		int money = 0;
		int max = 0;
		
		for (int i = 0 ; i < person ; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			if ( a == b && b == c ) {
				money = 10000 + a * 1000;
			} else if ( a != b && b != c && c != a ) {
				money = Math.max(Math.max(a, b), c) * 100;
			} else {
				if ( a == b || a == c ) {
					money = 1000 + a * 100;
				} else {
					money = 1000 + b * 100;
				}
			}
			
			if ( max < money ) {
				max = money;
			}
		}
		
		System.out.println(max);
		scan.close();
		
	}
	
}
