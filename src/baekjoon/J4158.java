package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class J4158 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String[] data = reader.readLine().split(" ");
			int n = Integer.parseInt(data[0]);
			int m = Integer.parseInt(data[1]);
			int cnt = 0;
			
			if ( n == 0 && m == 0 ) break;
			HashSet<Integer> set = new HashSet<>();
			
			for (int i = 0 ; i < n ; i++) {
				set.add(Integer.parseInt(reader.readLine()));
			}
			
			for (int i = 0 ; i < m ; i++) {
				int cd = Integer.parseInt(reader.readLine());
				if ( set.contains(cd) ) cnt++;
			}
			
			System.out.println(cnt);
		}
		
		reader.close();
		
	}
	
}
