package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alphabet = new int[26];
		String s = reader.readLine();
		
		for (int i = 0 ; i < s.length() ; i++) {
			alphabet[(int)s.charAt(i) - 97] += 1;
		}
		
		for (int i = 0 ; i < alphabet.length ; i++) {
			writer.write(alphabet[i] + " ");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
