package baekjoon;

// 캥거루 세마리2 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class j11034 {
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		int data[] = new int[3];
		for (int i = 0 ; i < 3 ; i++) {
			data[i] = scan.nextInt(); 
		}
		int a = data[1] - data[0];
		int b = data[2] - data[1];
		
		System.out.println(Math.max(a, b) - 1);
		
		scan.close();
	}

}
