package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1094 {
	public static void main(String[] args) throws IOException {
//	Memory 42628 Runtime 582		
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		int num[] = new int[count];
//		
//		for (int i = 0 ; i < count ; i++) {
//			num[i] = scan.nextInt();
//		}
//		
//		for (int j = num.length-1 ; j >= 0 ; j--) {
//			System.out.printf("%d ", num[j]);
//		}
//		
//		scan.close();
		
//	Memory 16520 Runtime 182
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		int students[] = new int[count];
		String num[] = reader.readLine().split(" ");
		int num_i = 0;
		
		for (int i = 0 ; i < count ; i++) {
			students[i] = Integer.parseInt(num[i]);
		}
		
		for (int j = students.length-1 ; j >= 0 ; j--) {
			System.out.print(students[j]+ " ");
		}
		
		reader.close();
	}
}
