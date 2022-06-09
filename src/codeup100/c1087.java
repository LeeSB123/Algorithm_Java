package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1087 {
	public static void main(String[] args) throws IOException {
//	Memory 14328 Runtime 119
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num = 0;
		for(int i = 1 ; num < n ; i++) {
			num += i;
		}
		System.out.println(num);
		scan.close();
	}
}
