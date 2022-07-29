package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class J10757 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		BigInteger a = new BigInteger(scan.next());
		BigInteger b = new BigInteger(scan.next());
		
		a = a.add(b);
		
		System.out.println(a.toString());
		scan.close();
	}
	
}
