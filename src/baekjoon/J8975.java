package baekjoon;
// .....미완 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class J8975 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = 0;
		
		int N = Integer.parseInt(reader.readLine());
		String[] title = new String[N];
		for (int i = 0 ; i < N ; i++) {
			title[i] = reader.readLine();
		}
		
		int M = Integer.parseInt(reader.readLine());
		String[] song = new String[M];
		for (int i = 0 ; i < M ; i++) {
			song[i] = reader.readLine();
		}
		
		for (int j = 0 ; j < M ; j++) {
			for (int i = 0 ; i < N ; i++) {
				if ( song[j] == title[i] ) cnt++;
				if ( cnt >= N / 2 ) writer.write(j);
				
			}
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
