package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1284 {

	public static void main(String...args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			int count = 0;
			int n = Integer.parseInt(reader.readLine());
			
			if ( n == 0 ) break;
			
			while ( n != 0 ) {
				if ( n % 10 == 1 ) {
					count += 2;
				} else if ( n % 10 == 0 ) {
					count += 4;
				} else {
					count += 3;
				}
				
				count++;
				n /= 10;
			}
			
			count++;
			
			System.out.println(count);
			
		}
		
		reader.close();
		
	}
	
}
