package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class J2204 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			int N = Integer.parseInt(reader.readLine());
			if ( N == 0 ) {
				break;
			} else {
				String[] data = new String[N];
				for (int i = 0 ; i < N ; i++) {
					data[i] = reader.readLine();
				}
				Arrays.sort(data, String.CASE_INSENSITIVE_ORDER);
				writer.write(data[0] + "\n");
			}
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
