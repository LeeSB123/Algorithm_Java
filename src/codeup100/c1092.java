package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1092 {
	public static void main(String[] args) throws IOException {
//	Memory 14308 Runtime 109		
//		Scanner scan = new Scanner(System.in);
//		String cycle[] = scan.nextLine().split(" ");
//		int a = Integer.parseInt(cycle[0]);
//		int b = Integer.parseInt(cycle[1]);
//		int c = Integer.parseInt(cycle[2]);
//		int day = 1;
//		
//		while (day % a != 0 || day % b != 0 || day % c != 0) day++;
//		System.out.println(day);
//		
//		scan.close();
		
//	Memory 11216 Runtime 75
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cycle[] = reader.readLine().split(" ");
		int a = Integer.parseInt(cycle[0]);
		int b = Integer.parseInt(cycle[1]);
		int c = Integer.parseInt(cycle[2]);
		int day = 1;
		
		while (day % a != 0 || day % b != 0 || day % c != 0) day++;
		System.out.println(day);
	}
}
