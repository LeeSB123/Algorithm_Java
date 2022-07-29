package baekjoon;

import java.util.Scanner;

public class J2606 {

	static int map[][];
	static boolean visit[];
	static int pc, cable, startPc;
	static int count = 0;
	
	public static int dfs(int i) {
		visit[i] = true;
		
		for (int j = 1 ; j <= pc ; j++) {
			if ( map[i][j] == 1 && visit[j] == false ) {
				count++;
				dfs(j);
			}
		}
		
		return count;
	}
	
	public static void main(String...args) {
		// Memory 18124kb Runtime 232ms
		Scanner scan = new Scanner(System.in);
		pc = scan.nextInt();
		cable = scan.nextInt();
		startPc = 1;
		map = new int[pc + 1][pc + 1];
		visit = new boolean[pc + 1];
		
		for (int i = 0 ; i < cable ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		
		System.out.println(dfs(1));
		scan.close();
		
	}
	
}
