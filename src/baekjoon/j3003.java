package baekjoon;

// 킹, 퀸, 룩, 비숍, 나이트, 폰 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class j3003 {
	public static void main(String[] args) throws IOException {
//	Memory 18364kb Runtime 224ms
//		Scanner scan = new Scanner(System.in);
//		int find[] = new int[6];
//		int all[] = { 1, 1, 2, 2, 2, 8 };
//		
//		for (int i = 0 ; i < find.length ; i++) {
//			find[i] = scan.nextInt();
//		}
//		
//		for (int i = 0 ; i < find.length ; i++) {
//			all[i] -= find[i];
//			System.out.print(all[i] + " ");
//		}
//		scan.close();

//		Memory 15876kb Runtime 148ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input[] = reader.readLine().split(" ");
		int all[] = { 1, 1, 2, 2, 2, 8 };
		int find[] = new int[6];
		
		for (int i = 0 ; i < input.length; i++) {
			find[i] = Integer.parseInt(input[i]);
		}
		
		for (int i = 0 ; i < find.length; i++) {
			all[i] -= find[i];
			System.out.print(all[i] + " ");
		}
		reader.close();
	}
}
