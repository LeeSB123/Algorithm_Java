package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J9610 {

	public static void main(String...args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		int[][] field = new int[num][2];
		int x, y;
		int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
		
		for (int i = 0 ; i < num ; i++) {
			String[] strField = reader.readLine().split(" ");
			for (int j = 0 ; j < 2 ; j++) {
				field[i][j] = Integer.parseInt(strField[j]);
			}
		}
		
		for (int i = 0 ; i < num ; i++) {
			if ( field[i][0] > 0 && field[i][1] > 0 ) {
				q1++;;
			} else if ( field[i][0] < 0 && field[i][1] > 0 ) {
				q2++;
			} else if ( field[i][0] < 0 && field[i][1] < 0 ) {
				q3++;
			} else if ( field[i][0] > 0 && field[i][1] < 0 ) {
				q4++;
			} else if ( field[i][0] == 0 || field[i][1] == 0 ) {
				axis++;
			}
		}
		
		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
		
		reader.close();
		
	}
	
}
