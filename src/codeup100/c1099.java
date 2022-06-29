package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class c1099 {
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int house[][] = new int[11][11];
		
		for (int i = 1 ; i < house.length ; i++) {
			for (int j = 1 ; j < house.length ; j++) {
				house[i][j] = scan.nextInt();
			}
		}
		
		int count = 2; // 이동을 위해 y좌표 저장 
		Boolean arrival = false;
		
		for (int i = 2 ; i < 11 ; i++) {
			for (int j = 2 ; j < 11 ; j++) {
				if (house[i][j] == 2) {
					arrival = true;
					house[i][j] = 9;
					break;
				}
				if (house[i][j] == 0) {
					house[i][j] = 9;
				} else if (house[i][j] == 1) {
					count = j - 1;
					break;
				}
			}
			
			if (arrival) break;
		}
		
		for (int i = 1 ; i < house.length ; i++) {
			for (int j = 1 ; j < house.length ; j++) {
				System.out.printf("%d ", house[i][j]);
			}
			System.out.println();
		}
		
		scan.close();
	}
}
