package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1089 {
	public static void main(String[] args) throws IOException {
//	Memory 14316 Runtime 107		
//		Scanner scan = new Scanner(System.in);
//		String data[] = scan.nextLine().split(" ");
//		
//		int a = Integer.parseInt(data[0]);
//		int d = Integer.parseInt(data[1]);
//		int n = Integer.parseInt(data[2]);
//		
//		for(int i = 1 ; i < n ; i++) {
//			a += d;
//		}
//		
//		System.out.println(a);
//		scan.close();
		
//	Memory 11144 Runtime 68
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		
		int a = Integer.parseInt(data[0]);
		int d = Integer.parseInt(data[1]);
		int n = Integer.parseInt(data[2]);
		
		for(int i = 1 ; i < n ; i++) {
			a += d;
		}
		
		System.out.println(a);
		reader.close();
	}
}