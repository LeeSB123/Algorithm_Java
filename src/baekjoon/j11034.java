package baekjoon;

// 캥거루 세마리2 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Scanner;

public class j11034 {
	
	public static void main(String[] args) throws IOException {
//	Memory 17320kb Runtime 204ms
//		Scanner scan = new Scanner(System.in);
//		
//		while (scan.hasNextInt()) {
//			int a = scan.nextInt();
//			int b = scan.nextInt();
//			int c = scan.nextInt();
//			
//			System.out.println(Math.max((c - b) - 1, (b - a) - 1));
//		}
//		scan.close();
		
//	Memory 14036kb Runtime 120ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while ((s = reader.readLine()) != null) {
			StringTokenizer token = new StringTokenizer(s);
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			
			System.out.println(Math.max((c - b) - 1, (b - a) - 1));
		}
		reader.close();
	}

}