package baekjoon;

// 5와 6의 차이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class j2864 {
	public static void main(String[] args) throws IOException {
//	memory 18776kb runtime 244ms
//		Scanner scan = new Scanner(System.in);
//		String a = scan.next();
//		String b = scan.next();
//		
//		String a5_6 = "";
//		String a6_5 = "";
//		String b5_6 = "";
//		String b6_5 = "";
//		
//		for (int i = 0 ; i < a.length() ; i++) {
//			if (a.charAt(i) == '6') {
//				a6_5 = a6_5 + "5";
//			} else {
//				a6_5 = a6_5 + a.charAt(i);
//			}
//			if (a.charAt(i) == '5') {
//				a5_6 = a5_6 + "6";
//			} else {
//				a5_6 = a5_6 + a.charAt(i);
//			}
//		}
//		for (int i = 0 ; i < b.length() ; i++) {
//			if (b.charAt(i) == '6') {
//				b6_5 = b6_5 + "5";
//			} else {
//				b6_5 = b6_5 + b.charAt(i);
//			}
//			if (b.charAt(i) == '5') {
//				b5_6 = b5_6 + "6";
//			} else {
//				b5_6 = b5_6 + b.charAt(i);
//			}
//		}
//		
//		int min = Integer.parseInt(a6_5) + Integer.parseInt(b6_5);
//		int max = Integer.parseInt(a5_6) + Integer.parseInt(b5_6);
//		
//		System.out.println(min + " " + max);
//		
//		scan.close();
		
//	memory 16492kb runtime 180ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input[] = reader.readLine().split(" "); // input[0,1]
		String a = input[0];
		String b = input[1];
		
		String a5_6 = "";
		String a6_5 = "";
		String b5_6 = "";
		String b6_5 = "";
		
		for (int i = 0 ; i < a.length() ; i++) {
			if (a.charAt(i) == '6') {
				a6_5 = a6_5 + "5";
			} else {
				a6_5 = a6_5 + a.charAt(i);
			}
			if (a.charAt(i) == '5') {
				a5_6 = a5_6 + "6";
			} else {
				a5_6 = a5_6 + a.charAt(i);
			}
		}
		for (int i = 0 ; i < b.length() ; i++) {
			if (b.charAt(i) == '6') {
				b6_5 = b6_5 + "5";
			} else {
				b6_5 = b6_5 + b.charAt(i);
			}
			if (b.charAt(i) == '5') {
				b5_6 = b5_6 + "6";
			} else {
				b5_6 = b5_6 + b.charAt(i);
			}
		}
		
		int min = Integer.parseInt(a6_5) + Integer.parseInt(b6_5);
		int max = Integer.parseInt(a5_6) + Integer.parseInt(b5_6);
		
		System.out.println(min + " " + max);
		reader.close();
		
	}
}
