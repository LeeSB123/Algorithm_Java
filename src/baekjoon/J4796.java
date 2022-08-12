package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J4796 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		
		while (true) {
			String[] input = reader.readLine().split(" ");
			int L = Integer.parseInt(input[0]);
			int P = Integer.parseInt(input[1]);
			int V = Integer.parseInt(input[2]);
			
			if ( L == 0 && P == 0 && V == 0 ) break;
			
			int date = (V / P) * L + Math.min((V % P), L);
			cnt++;
			writer.write("Case " + String.valueOf(cnt) + ": " + String.valueOf(date) + "\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
