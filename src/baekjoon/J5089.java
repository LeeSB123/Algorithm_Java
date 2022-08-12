package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;

public class J5089 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int week = 0;
		
		while (true) {
			int cnt = 0;
			
			int N = Integer.parseInt(reader.readLine());
			String[] city = new String[N];
			
			if ( N == 0 ) break;
			
			for (int i = 0 ; i < N ; i++) {
				city[i] = reader.readLine();
			}
			
			HashSet<String> hashSet = new HashSet<>(Arrays.asList(city));
			String[] reCity = hashSet.toArray(new String[0]);
			week++;
			
			writer.write("Week " + week + " " + reCity.length + "\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
