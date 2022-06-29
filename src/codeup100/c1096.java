package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class c1096 {
	public static void main(String[] args) throws IOException {
//	Memory 15144 Runtime 160		
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int field[][] = new int[19][19];
//		
//		for (int i = 0 ; i < num ; i++) {
//			int x = scan.nextInt();
//			int y = scan.nextInt();
//			field [x-1][y-1] = 1; // x,y를 받아서 바로 배열 해당 위치 1적용 
//		}
//		
//		for (int i = 0 ; i < field.length ; i++) {
//			for (int j = 0 ; j < field.length ; j++) {
//				System.out.printf("%d", field[i][j]);
//			}
//			System.out.println();
//		}
//		
//		scan.close();
		
//	Memory 14792 Runtime 150
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int count = Integer.parseInt(reader.readLine());
//		int field[][] = new int[19][19];
//		
//		for (int i = 0 ; i < count ; i++) {
//			String data[] = reader.readLine().split(" ");
//			int x = Integer.parseInt(data[0]);
//			int y = Integer.parseInt(data[1]);
//			field[x-1][y-1] = 1;
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
		
//	Memory 11320 Runtime 71
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(reader.readLine());
		int field[][] = new int[19][19];
		
		for (int i = 0 ; i < count ; i++) {
		    String data[] = reader.readLine().split(" ");
			int x = Integer.parseInt(data[0]);
			int y = Integer.parseInt(data[1]);
			field[x-1][y-1] = 1;
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
