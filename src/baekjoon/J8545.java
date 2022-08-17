package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J8545 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String data = reader.readLine();
		StringBuffer buffer = new StringBuffer(data);
		String reversedData = buffer.reverse().toString();
		
		writer.write(reversedData);
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
