package baekjoon;

// 전자레인지 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class J10162 {
	public static void main(String[] args) throws IOException {
//	memory 18728kb runtime 244ms
//		Scanner scan = new Scanner(System.in);
//		int t = scan.nextInt();
//		
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		
//		if (t >= 300) {
//			a = t / 300;
//			t -= 300 * a;
//		}
//		if (t >= 60) {
//			b = t / 60;
//			t -= 60 * b;
//		}
//		if (t % 10 != 0) {
//			System.out.println("-1");
//			System.exit(0); // 강제종료 
//		}
//		else {
//			c = t / 10;
//			System.out.println(a +" "+ b + " " + c);
//		}
//		
//		scan.close();

//	memory 16352kb runtime 180ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if (t >= 300 ) {
			a = t / 300;
			t -= 300 * a;
		}
		if (t >= 60) {
			b = t / 60;
			t -= 60 * b;
		}
		if (t % 10 != 0) {
			System.out.println("-1");
			System.exit(0);
		}
		else {
			c = t / 10;
			System.out.println(a + " " + b + " " + c);
		}
		reader.close();
	}
}
