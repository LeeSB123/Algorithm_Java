package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1095 {
	public static void main(String[] args) throws IOException {
//	Memory 31304 Runtime 246
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//		int num = 0;
//		int min = 0;
//		
//		for (int i = 0 ; i < count ; i++) {
//			num = scan.nextInt();
//			if (i == 0) {
//				min = num; //첫 num을 min에
//			} else if (min > num) {
//				// 새 num이 들어올 때마 min과 비교
//				min = num;  
//			}
//		}
//		System.out.println(min);
//		scan.close();
		
//	Memory 13136 Runtime 84
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		
		String data[] = new String[count];
		data = reader.readLine().split(" ");
		
		int min = 0;
		
		for (int i = 0 ; i < data.length ; i++) {
			if (i == 0) {
				min = Integer.parseInt(data[i]);
			} else if (min > Integer.parseInt(data[i])) {
				min = Integer.parseInt(data[i]);
			}
		}
		
		System.out.println(min);
		reader.close();
	}
}
