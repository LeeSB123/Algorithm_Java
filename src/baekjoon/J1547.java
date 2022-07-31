package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J1547 {

	public static void main(String...args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] position = new String[2];
		int posA, posB;
		int ball = 1;
		int count = Integer.parseInt(reader.readLine());
		
		for (int i = 0 ; i < count ; i++) {
			position = reader.readLine().split(" ");
			posA = Integer.parseInt(position[0]);
			posB = Integer.parseInt(position[1]);
			
			if ( ball == posA ) ball = posB;
			else if (ball == posB ) ball = posA;
		}
		
		System.out.println(ball);
		reader.close();
		
	}
	
}
