package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class c1098 {
	public static void main(String[] args) throws IOException {
//	Memory 14748 Runtime 133
//		Scanner scan = new Scanner(System.in);
//		int w = scan.nextInt();
//		int h = scan.nextInt();
//		int field[][] = new int[h+1][w+1];
//		int num = scan.nextInt();
//		
//		for (int i = 0 ; i < num ; i++) {
//			int l = scan.nextInt();
//			int d = scan.nextInt();
//			int x = scan.nextInt();
//			int y = scan.nextInt();
//			
//			if (d == 0) {
//				for (int j = 1 ; j <= l ; j++) {
//					field[x][y-1+j] = 1;
//				}
//			} else if (d == 1) {
//				for (int j = 1 ; j <= l ; j++) {
//					field[x-1+j][y] = 1;
//				}
//			}
//		}
//		
//		for (int i = 1 ; i <= h ; i++) {
//			for (int j = 1 ; j <= w ; j++) {
//				System.out.printf("%d ", field[i][j]);
//			}
//			System.out.println();
//		}
//		
//		scan.close();
		
//	Memory 14492 Runtime 117
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		String wh[] = reader.readLine().split(" ");
//		int h = Integer.parseInt(wh[0]);
//		int w = Integer.parseInt(wh[1]);
//		
//		int field[][] = new int[h+1][w+1];
//		int num = Integer.parseInt(reader.readLine());
//		
//		for (int i = 0 ; i < num ; i++) {
//			String data[] = reader.readLine().split(" ");
//			int l = Integer.parseInt(data[0]);
//			int d = Integer.parseInt(data[1]);
//			int x = Integer.parseInt(data[2]);
//			int y = Integer.parseInt(data[3]);
//			
//			if (d == 0) {
//				for (int j = 1 ; j <= l ; j++) {
//					field[x][y-1+j] = 1;
//				}
//			} else if (d == 1) {
//				for (int j = 1 ; j <= l ; j++) {
//					field[x-1+j][y] = 1;
//				}
//			}
//		}
//		
//		for (int i = 1 ; i <= h ; i++) {
//			for (int j = 1 ; j <= w ; j++) {
//				System.out.printf("%d ", field[i][j]);
//			}
//			System.out.println();
//		}
//		
//		reader.close();
		
//	Memory 11304 Runtime 70
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String wh[] = reader.readLine().split(" ");
		int h = Integer.parseInt(wh[0]);
		int w = Integer.parseInt(wh[1]);
		
		int field[][] = new int[h+1][w+1];
		int num = Integer.parseInt(reader.readLine());
		
		for (int i = 0 ; i < num ; i++) {
			String data[] = reader.readLine().split(" ");
			int l = Integer.parseInt(data[0]);
			int d = Integer.parseInt(data[1]);
			int x = Integer.parseInt(data[2]);
			int y = Integer.parseInt(data[3]);
			
			if (d == 0) {
				for (int j = 1 ; j <= l ; j++) {
					field[x][y-1+j] = 1;
				}
			} else if (d == 1) {
				for (int j = 1 ; j <= l ; j++) {
					field[x-1+j][y] = 1;
				}
			}
		}
		
		for (int i = 1 ; i <= h ; i++) {
			for (int j = 1 ; j <= w ; j++) {
				writer.write(field[i][j] + " ");
			}
			writer.write("\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
	}
}
