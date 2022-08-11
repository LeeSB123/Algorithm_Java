package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class J25305 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int k = scan.nextInt();
		Integer[] student = new Integer[N];
		
		for (int i = 0 ; i < N ; i++) {
			student[i] = scan.nextInt();
		}
		
		Arrays.sort(student, Collections.reverseOrder());
		
		System.out.println(student[k - 1]);
		scan.close();		
		
	}
	
}
