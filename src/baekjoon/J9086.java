package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J9086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		
		for (int i = 0 ; i < n ; i++) {
			String data = reader.readLine();
			String first = String.valueOf(data.charAt(0));
			String last = String.valueOf(data.charAt(data.length() - 1));
			
			writer.write(first + last + "\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
