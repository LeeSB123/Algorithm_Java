package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1082 {
	public static void main(String[] args) throws IOException {
//	sol1 Memory 14316 Runtime 114
//		Scanner input = new Scanner(System.in);
//		String data = input.nextLine();
//		String change, result;
//		
//		int n = Integer.valueOf(data, 16);
//		
//		for (int i = 1 ; i < 16 ; i++) {
//			change = Integer.toHexString(i).toUpperCase();
//			result = Integer.toHexString(n * i).toUpperCase();
//			System.out.println(data + "*" + change + "=" + result);
//		}
//		input.close();
	
//	sol2 Memory 11192 Runtime 67
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String data = input.readLine();
		String change, result;
		
		int n = Integer.parseInt(data, 16);
		
		for (int i = 1 ; i < 16 ; i++) {
			change = Integer.toHexString(i).toUpperCase();
			result = Integer.toHexString(n * i).toUpperCase();
			System.out.println(data + "*" + change + "=" + result);
		}
		input.close();
	}
}
