package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J2744 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String data = reader.readLine();
		char tmp;
		String output = "";
		
		for (int i = 0 ; i < data.length() ; i++) {
			tmp = data.charAt(i);
			
			if ( 65 <= tmp && tmp <= 90 ) {
				output += data.valueOf(tmp).toLowerCase();
			} else if ( 97 <= tmp && tmp <= 122 ) {
				output += data.valueOf(tmp).toUpperCase();
			} else {
				output += (char)tmp;
			}
		}
		
		writer.write(output);
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
