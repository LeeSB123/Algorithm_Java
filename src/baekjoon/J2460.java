package baekjoon;

import java.util.Scanner;

public class J2460 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] train = new int[10][2];
		int count = 0;
		int max = 0;
		
		for (int i = 0 ; i < 10 ; i++) {
			train[i][0] = scan.nextInt();
			train[i][1] = scan.nextInt();
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			int j = 0;
			if ( train[i][j] == train[0][0] ) {
				count += train[i][1];
			} else if ( train[i][j] == train[9][1] ) {
				count -= train[i][0];
			} else {
				count -= train[i][0];
				count += train[i][1];
			}
			
			if ( max < count ) {
				max = count;
			}
			j++;	

		}
		
		System.out.println(max);
		scan.close();
		
	}
	
}
