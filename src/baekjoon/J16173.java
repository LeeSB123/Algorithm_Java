package baekjoon;
// 미완 
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J16173 {
	
	static int map[][];
	static boolean visit[][];
	static int n;
	static int dr[] = {1, 0};
	static int dc[] = {0, 1};
	
	public int dfs(int i) {
		
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());
		map = new int[n][n];
		visit = new boolean[n][n];
		
		for (int i = 0 ; i < n ; i++ ) {
			StringTokenizer token = new StringTokenizer(reader.readLine());
			for (int j = 0 ; j < n ; j++) {
				map[i][j] = Integer.parseInt(token.nextToken());
			}
		}
		
	}
	
}
