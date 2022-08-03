package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J24883 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = reader.readLine();
		
		if ( input.equals("N") || input.equals("n") ) {
			writer.write("Naver D2");
		} else {
			writer.write("Naver Whale");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
