package codeup100;

import java.util.Scanner;

public class c1079 {
	public static void main(String[] args) {
// 	sol Memory 14320 Runtime 116
		Scanner input = new Scanner(System.in);
		char data = ' ';
		
		while (data != 'q') {
			data = input.next().charAt(0);
			System.out.println(data);
		}
		
		input.close();
	}
}