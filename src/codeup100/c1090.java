package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1090 {
	public static void main(String[] args) throws IOException {
//	Memory 14320 Runtime 108		
//		Scanner scan = new Scanner(System.in);
//		String data[] = scan.nextLine().split(" ");
//		
//		int a = Integer.parseInt(data[0]);
//		int r = Integer.parseInt(data[1]);
//		int n = Integer.parseInt(data[2]);
//		long result = 0;
//		
//		for(int i = 1 ; i < n ; i++) {
//			result = (long)(a * Math.pow(r, i)); // 거듭제곱 계산
//		}
//		
//		System.out.println(result);
//		scan.close();
		
//	Memory 11180 Runtime 80
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		
		int a = Integer.parseInt(data[0]);
		int r = Integer.parseInt(data[1]);
		int n = Integer.parseInt(data[2]);
		long result = 0;
		
		for(int i = 1 ; i < n ; i++) {
			result = (long)(a * Math.pow(r, i)); // 거듭제곱 계산
		}
		
		System.out.println(result);
	}
}