package baekjoon;

// 우유 축제 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class j14720 {
	public static void main(String[] args) throws IOException {
//	memory 19976kb runtime 260ms
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int data[] = new int[n];
//		int count = 0;
//		int able = 0;
//		
//		for (int i = 0 ; i < n ; i++) {
//			data[i] = scan.nextInt();
//		}
//		
//		for (int i = 0 ; i < data.length ; i++) {
//			if (data[i] == able && able == 0) {
//				count++;
//				able = 1;
//				continue;
//			}
//			if (data[i] == able && able == 1) {
//				count++;
//				able = 2;
//				continue;
//			}
//			if (data[i] == able && able == 2) {
//				count++;
//				able = 0;
//				continue;
//			}
//		}
//		System.out.println(count);
//		scan.close();
		
//		memory 14352kb runtime 132ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String input[] = reader.readLine().split(" ");
		int data[] = new int[n];
		int count = 0;
		int able = 0;
		
		for (int i = 0 ; i < n ; i++) {
			data[i] = Integer.parseInt(input[i]);
		}
		
		for (int i = 0 ; i < data.length ; i++) {
			if (data[i] == able && able == 0) {
				count++;
				able = 1;
				continue;
			}
			if (data[i] == able && able == 1) {
				count++;
				able = 2;
				continue;
			}
			if (data[i] == able && able == 2) {
				count++;
				able = 0;
				continue;
			}
		}
		System.out.println(count);
		reader.close();
	}
}
