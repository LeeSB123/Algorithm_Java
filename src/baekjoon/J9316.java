package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J9316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 1 ; i <= n ; i++) {
			System.out.printf("Hello World, Judge %d!", i);
			System.out.println();
		}
		
		reader.close();
		
	}
	
}
