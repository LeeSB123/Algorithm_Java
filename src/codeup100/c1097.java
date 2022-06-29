package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class c1097 {
	public static void main(String[] args) throws IOException {
//	Memory 15536 Runtime 182
//		Scanner scan = new Scanner(System.in);
//		
//		int field[][] = new int[19][19];		
//		for (int i = 0 ; i < field.length ; i++) {
//			for (int j = 0 ; j < field.length ; j++) {
//				field[i][j] = scan.nextInt();
//			}
//		}
//		
//		int count = scan.nextInt();
//		for (int i = 0 ; i < count ; i++) {
//			int x = scan.nextInt() - 1;
//			int y = scan.nextInt() - 1;
//			
//			for (int j = 0 ; j < field.length ; j++) {
//				if (field[x][j] == 0) {
//					field[x][j] = 1;
//				} else {
//					field[x][j] = 0;
//				}
//			}
//			for (int z = 0 ; z < field.length ; z++) {
//				if (field[z][y] == 0) {
//					field[z][y] = 1;
//				} else {
//					field[z][y] = 0;
//				}
//			}
//			
//		}
//		
//		for (int i = 0 ; i < field.length ; i++) {
//			for (int j = 0 ; j < field.length ; j++) {
//				System.out.printf("%d ", field[i][j]);
//			}
//			System.out.println();
//		}
//		
//		scan.close();
		
//	Memory 14952 Runtime 153
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int field[][] = new int[19][19];
//		
//		for (int i = 0 ; i < field.length ; i++) {
//			String data[] = new String[19];
//			data = reader.readLine().split(" ");
//			
//			for (int j = 0 ; j < field.length ; j++) {
//				field[i][j] = Integer.parseInt(data[j]);
//			}
//		}
//		
//		int count = Integer.parseInt(reader.readLine());
//		for (int i = 0 ; i < count ; i++) {
//			String location[] = reader.readLine().split(" ");
//			int x = Integer.parseInt(location[0]) - 1;
//			int y = Integer.parseInt(location[1]) - 1;
//			
//			for (int j = 0 ; j < field.length ; j++) {
//				if (field[x][j] == 0) {
//					field[x][j] = 1;
//				} else {
//					field[x][j] = 0;
//				}
//			}
//			
//			for (int z = 0 ; z < field.length ; z++) {
//				if (field[z][y] == 0) {
//					field[z][y] = 1;
//				} else {
//					field[z][y] = 0;
//				}
//			}
//		}
//		
//		for (int i = 0 ; i < field.length ; i++) {
//			for (int j = 0 ; j < field.length ; j++) {
//				System.out.printf("%d ", field[i][j]);
//			}
//			System.out.println();
//		}
//		
//		reader.close();
		
//	Memory 11336 Runtime 72
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int field[][] = new int[19][19];
		
		for (int i = 0 ; i < field.length ; i++) {
			String data[] = new String[19];
			data = reader.readLine().split(" ");
			
			for (int j = 0 ; j < field.length ; j++) {
				field[i][j] = Integer.parseInt(data[j]);
			}
		}
		
		int count = Integer.parseInt(reader.readLine());
		for (int i = 0 ; i < count ; i++) {
			String location[] = reader.readLine().split(" ");
			int x = Integer.parseInt(location[0]) - 1;
			int y = Integer.parseInt(location[1]) - 1;
			
			for (int j = 0 ; j < field.length ; j++) {
				if (field[x][j] == 0) {
					field[x][j] = 1;
				} else {
					field[x][j] = 0;
				}
			}
			
			for (int z = 0 ; z < field.length ; z++) {
				if (field[z][y] == 0) {
					field[z][y] = 1;
				} else {
					field[z][y] = 0;
				}
			}
		}
		
		for (int i = 0 ; i < field.length ; i++) {
			for (int j = 0 ; j < field.length ; j++) {
				writer.write(field[i][j] + " ");
			}
			writer.write("\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
	}
}

