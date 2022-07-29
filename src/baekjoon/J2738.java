package baekjoon;

import java.util.Scanner;

public class J2738 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] data = new int[N][M];
		
		for (int i = 0 ; i < 2 ; i++) {
			for (int j = 0 ; j < N ; j++) {
				for (int z = 0 ; z < M ; z++) {
					data[j][z] += scan.nextInt();
				}
			}
		}
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = 0 ; j < M ; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
		
	}
	
}
