package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J9295 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		int[] dice = new int[2];
		
		for (int i = 0 ; i < t ; i++) {
			String[] strDice = reader.readLine().split(" ");
			for (int j = 0 ; j < dice.length ; j++) {
				dice[j] = Integer.parseInt(strDice[j]);
			}
			
			System.out.printf("Case %d: ", i + 1);
			System.out.println(dice[0] + dice[1]);
		}
		
		reader.close();
		
	}
	
}
