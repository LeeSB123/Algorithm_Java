package baekjoon;

import java.util.Scanner;

public class J2738 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = 0, M = 0;
		int[][] dataA = new int[N][M];
		int[][] dataB = new int[N][M];
		int[][] result = new int[N][M];
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < M ; j++) {
				dataA[i][j] = scan.nextInt();
				result[i][j] += dataA[i][j];
			}
		}
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < M ; j++) {
				dataB[i][j] = scan.nextInt();
				result[i][j] += dataB[i][j];
			}
		}
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < M ; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
