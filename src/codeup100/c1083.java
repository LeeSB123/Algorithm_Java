package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1083 {
	public static void main(String[] args) throws IOException {
//	Memory 14356 Runtime 110
//		Scanner input = new Scanner(System.in);
//		int data = input.nextInt();
//		
//		for (int i = 1 ; i <= data ; i++) {
//			if (i % 3 == 0) {
//				System.out.print("X ");
//			} else {
//				System.out.print(i + " ");
//			}
//		input.close();
//		}

//	Memory 11168 Runtime 70
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int data = Integer.parseInt(input.readLine());
		
		for (int i = 1 ; i<= data ; i++) {
			if (i % 3 == 0) {
				System.out.print("X ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
