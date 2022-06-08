package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1085 {
	public static void main(String[] args) throws IOException {
//	Memory 144565 Runtime 116
//		Scanner scan = new Scanner(System.in);
//		String data[] = scan.nextLine().split(" ");
//		double h = Double.parseDouble(data[0]);
//		double b = Double.parseDouble(data[1]);
//		double c = Double.parseDouble(data[2]);
//		double s = Double.parseDouble(data[3]);
//		double ans = h * b * c * s;
//		System.out.printf("%.1f MB", ans/8/1024/1024);
//		scan.close();
		
		
//	Memory 14256 Runtime 112
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		double h = Double.parseDouble(data[0]);
		double b = Double.parseDouble(data[1]);
		double c = Double.parseDouble(data[2]);
		double s = Double.parseDouble(data[3]);
		double ans = h * b * c * s;
		System.out.printf("%.1f MB", ans/8/1024/1024);
	}
}
