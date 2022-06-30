package baekjoon;

// 우유 축제 
import java.util. Scanner;

public class j14720 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int line[] = new int[n];
		int x = 0;
		int next = 0;
		
		for (int i = 0 ; i < line.length ; i++) {
			if (line[i] == next && next == 0) {
				x++;
				next = 1;
				continue;
			}
			if (line[i] == next && next == 1) {
				x++;
				next = 2;
				continue;
			}
			if (line[i] == next && next == 2) {
				x++;
				next = 0;
				continue;
			}
		}
		System.out.println(x);
		scan.close();
	}
}
