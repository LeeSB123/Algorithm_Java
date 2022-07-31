package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2566 {

	public static void main(String...args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] field = new int[9][9];
		int max = 0;
		int row = 0;
		int column = 0;
		
		for (int i = 0 ; i < 9 ; i++) {
			String[] strField = reader.readLine().split(" ");
			for (int j = 0 ; j < strField.length ; j++) {
				field[i][j] = Integer.parseInt(strField[j]);
			}
		}
		
		for (int i = 0 ; i < 9 ; i++) {
			for (int j = 0 ; j < 9 ; j++) {		
				if ( max < field[i][j] ) {
					max = field[i][j];
					row = i;
					column = j;
				}
			}
		}
		
		System.out.println(max + "\n" + (row + 1) + " " + (column + 1));
		reader.close();
		
	}
	
}
