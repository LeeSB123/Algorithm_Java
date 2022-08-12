package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class J6996 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(reader.readLine());
		
		for (int i = 0 ; i < N ; i++) {
			String[] data = reader.readLine().split(" ");
			
			char[] first = data[0].toCharArray();
			char[] second = data[1].toCharArray();
			
			Arrays.sort(first);
			Arrays.sort(second);
			
			if ( Arrays.equals(first, second) ) {
				writer.write(data[0] + " & " + data[1] + " are anagrams.\n");
			} else {
				writer.write(data[0] + " & " + data[1] + " are NOT anagrams.\n");
			}
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
