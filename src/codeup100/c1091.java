package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1091 {
	public static void main(String[] args) throws IOException {
//	Memory 14312 Runtime 107		
//		Scanner scan = new Scanner(System.in);
//		String data[] = scan.nextLine().split(" ");
//		
//		long a = Integer.parseInt(data[0]);
//		int m = Integer.parseInt(data[1]);
//		int d = Integer.parseInt(data[2]);
//		int n = Integer.parseInt(data[3]);
//		
//		for(int i = 1 ; i < n ; i++) {
//			a = a * m + d;
//		}
//		
//		System.out.println(a);
//		scan.close();
		
//	Memory 11176 Runtime 65
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		
		long a = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);
		int d = Integer.parseInt(data[2]);
		int n = Integer.parseInt(data[3]);
		
		for(int i = 1 ; i < n ; i++) {
			a = a * m + d;
		}
		
		System.out.println(a);
	}
}