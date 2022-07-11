package baekjoon;

// 크냐? 
import java.util.Scanner;

public class j4101 {
	public static void main(String[] args) {
//	Memory 18048kb Runtime 232ms
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if (a == 0 && b == 0) break;
			
			String result = a > b ? "Yes" : "No";
			System.out.println(result);
		}
		scan.close();
	}
}
