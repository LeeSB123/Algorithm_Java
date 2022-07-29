package baekjoon;

// 세탁소 사장 동혁 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class J2720 {
	public static void main(String[] args) throws IOException {
//	memory 19396kb runtime 320ms
//		Scanner scan = new Scanner(System.in);
//		int count = scan.nextInt();
//
//		while (count != 0) {
//			int m = scan.nextInt();
//			
//			int q = m / 25;
//			int d = (m - q * 25) / 10;
//			int n = (m - q * 25 - d * 10) / 5; 
//			int p = m - q * 25 - d * 10 - n * 5;
//			System.out.println(q + " " + d + " " + n + " " + p);
//			count--;
//		}
//		scan.close();
		
//	memory 16412kb runtime 220ms
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int count = Integer.parseInt(reader.readLine());
//		
//		while (count != 0) {
//			int m = Integer.parseInt(reader.readLine());
//			
//			int q = m / 25;
//			int d = (m - q * 25) / 10;
//			int n = (m - q * 25 - d * 10) / 5;
//			int p = m - q * 25 - d * 10 - n * 5;
//			System.out.println(q + " " + d + " " + n + " " + p);
//			count--;
//		}
//		reader.close();
		
//	memory 16328kb runtime 168ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(reader.readLine());
		
		while (count != 0) {
			int m = Integer.parseInt(reader.readLine());
			
			int q = m / 25;
			int d = (m - q * 25) / 10;
			int n = (m - q * 25 - d * 10) / 5;
			int p = m - q * 25 - d * 10 - n * 5;
			writer.write(q + " " + d + " " + n + " " + p + "\n");
			count--;
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
