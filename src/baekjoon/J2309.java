package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2309 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] tall = new int[9];
		int sum = 0;
		
		for (int i = 0 ; i < 9 ; i++) {
			tall[i] = Integer.parseInt(reader.readLine());
			sum += tall[i];
		}
		
		for (int i = 0 ; i < 8 ; i++) {
			for (int j = i + 1 ; j < 9 ; j++) {
				if ( sum - tall[i] - tall[j] == 100 ) {
					tall[i] = 0;
					tall[j] = 0;
					
					Arrays.sort(tall);
					for (int z = 2 ; z < 9 ; z++) {
						System.out.println(tall[z]);
					}
					return;
				}
			}
		}
		
		reader.close();
		
	}
	
}
