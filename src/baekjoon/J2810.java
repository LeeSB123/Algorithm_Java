package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2810 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		char[] seat = new char[N];
		int cnt = 1;
		
		String[] strSeat = reader.readLine().split("");
		for (int i = 0 ; i < N ; i++) {
			seat[i] = strSeat[i].charAt(0);
			
			if ( seat[i] == 'S' ) {
				cnt++;
			} else if ( seat[i] == 'L' ) {
				i++;
				cnt++;
			}
		}
		
		if ( cnt > N ) System.out.println(N);
		else System.out.println(cnt);
		reader.close();
		
	}
	
}
