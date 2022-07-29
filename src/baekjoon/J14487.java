package baekjoon;

// 욱제는 효도쟁이야! 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class J14487 {
	public static void main(String[] args) throws IOException {
//	Memory 66680kb Runtime 632kb
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int distance[] = new int[N];
//		int max = 0;
//		int sum = 0;
//		
//		for (int i = 0 ; i < N ; i++) {
//			distance[i] = scan.nextInt();
//			if (max < distance[i]) {
//				max = distance[i];
//			}
//			sum += distance[i];
//		}
//		
//		System.out.println(sum - max);
//		scan.close();
		
//	Memory 21336kb Runtime 236kb
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		String data[] = reader.readLine().split(" ");
		int distance[] = new int[N];
		int max = 0;
		int sum = 0;
		
		for (int i = 0 ; i < N ; i++) {
			distance[i] = Integer.parseInt(data[i]);
			if (max < distance[i]) {
				max = distance[i];
			}
			sum += distance[i];
		}
		
		System.out.println(sum - max);
		reader.close();
	}
}
