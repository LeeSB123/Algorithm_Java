package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1086 {
	public static void main(String[] args) throws IOException {
//	Memory 14496 Runtime 113
//		Scanner scan = new Scanner(System.in);
//		String data[] = scan.nextLine().split(" ");
//		int w = Integer.parseInt(data[0]);
//		int h = Integer.parseInt(data[1]);
//		int b = Integer.parseInt(data[2]);
//		float ans = (float)w * h * b;
//		System.out.printf("%.2f MB", ans/8/1024/1024);
//		scan.close();
		
		
//	Memory 14276 Runtime 107
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		int w = Integer.parseInt(data[0]);
		int h = Integer.parseInt(data[1]);
		int b = Integer.parseInt(data[2]);
		float ans = (float)w * h * b;
		System.out.printf("%.2f MB", ans/8/1024/1024);
		reader.close();
	}
}
