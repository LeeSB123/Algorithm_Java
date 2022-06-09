package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class c1084 {
	public static void main(String[] args) throws IOException {
//	Time Over
//		Scanner input = new Scanner(System.in);
//		int a = input.nextInt();
//		int b = input.nextInt();
//		int c = input.nextInt();
//		int count = 0;
//		
//		for (int i = 0 ; i < a ; i++) {
//			for (int j = 0 ; j < b ; j++) {
//				for (int z = 0 ; z < c ; z++) {
//					System.out.println(i + " " + j + " " + z);
//					count++;
//				}
//			}
//		}
//		input.close();
//		System.out.println(count);
		
//	Time Over
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        String data[] = input.readLine().split(" ");
//		int a = Integer.parseInt(data[0]);
//		int b = Integer.parseInt(data[1]);
//		int c = Integer.parseInt(data[2]);
//		int num = 0;
//		
//		for (int i = 0 ; i < a ; i++) {
//			for (int j = 0 ; j < b ; j++) {
//				for (int z = 0 ; z < c ; z++) {
//					System.out.println(i + " " + j + " " + z);
//					num++;
//				}
//			}
//		}
//		System.out.println(num);
		
//	Memory 51224 Runtime 377
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String data[] = reader.readLine().split(" ");
			int count = 0;
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			for (int i = 0 ; i < Integer.parseInt(data[0]) ; i++) {
				for (int j = 0 ; j < Integer.parseInt(data[1]) ; j++) {
					for (int z = 0 ; z < Integer.parseInt(data[2]) ; z++) {
						writer.write(i + " " + j + " " + z + "\n");
						count++;
					}
				}
			}
			writer.write(String.valueOf(count));
			writer.flush(); // 남아 있는 데이터 모두 출
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.close();
	}
}
