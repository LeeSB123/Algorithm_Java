package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1088 {
	public static void main(String[] args) throws IOException {
//	Memory 14360 Runtime 117
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			if (i % 3 == 0) continue;
			System.out.print(i + " ");
		}
		scan.close();
	}
}
