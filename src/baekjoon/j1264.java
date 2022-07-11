package baekjoon;

// 모음의 개수 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class j1264 {
	public static void main(String[] args) throws IOException {
//	Memory 14004kb Runtime 116ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for(;;) {
			String input = reader.readLine();
			int count = 0;
			if (input.equals("#")) break;
			
			input = input.toLowerCase();
			
			for (int i = 0 ; i < input.length() ; i++) {
				switch (input.charAt(i)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						count++;
					default:
						break;
				}
			}
			System.out.println(count);
		}
		
		reader.close();
	}
}
