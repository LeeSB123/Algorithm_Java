package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class J1271 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BigInteger money = scan.nextBigInteger();
		BigInteger people = scan.nextBigInteger();
		
		System.out.println(money.divide(people));
		System.out.println(money.remainder(people));
		scan.close();
		
	}
	
}
