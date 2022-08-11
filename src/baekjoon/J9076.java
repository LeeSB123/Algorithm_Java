package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J9076 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(reader.readLine());
		int[] data = new int[5];
		int sum = 0;
		
		for (int i = 0 ; i < cnt ; i++) {
			String[] strData = reader.readLine().split(" ");
			for (int j = 0 ; j < 5 ; j++) {
				data[j] = Integer.parseInt(strData[j]);
			}
			Arrays.sort(data);
			
			if ( data[3] - data[1] >= 4 ) {
				System.out.println("KIN");
			} else {
				sum = data[1] + data[2] + data[3];
				System.out.println(sum);
			}
		}
		
		reader.close();
		
	}
	
}
