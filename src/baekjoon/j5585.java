package baekjoon;

// 거스름돈 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class j5585 {
	public static void main(String[] args) throws IOException {
// Memory 17608kb Runtime 200ms
//		Scanner scan = new Scanner(System.in);
//		int money = 1000 - scan.nextInt();
//		int c_500 = 0;
//		int c_100 = 0;
//		int c_50 = 0;
//		int c_10 = 0;
//		int c_5 = 0;
//		int c_1 = 0;
//		int count = 0;
//		
//		c_500 = money / 500;
//		c_100 = (money - c_500 * 500) / 100;
//		c_50 = (money - c_500 * 500 - c_100 * 100) / 50;
//		c_10 = (money - c_500 * 500 - c_100 * 100 - c_50 * 50) / 10;
//		c_5 = (money - c_500 * 500 - c_100 * 100 - c_50 * 50 - c_10 * 10) / 5;
//		c_1 = (money - c_500 * 500 - c_100 * 100 - c_50 * 50 - c_10 * 10 - c_5 * 5);
//		count = c_500 + c_100 + c_50 + c_10 + c_5 + c_1;
//		
//		System.out.println(count);
//		scan.close();
		
//	Memory 14060kb Runtime 120ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int money = 1000 - Integer.parseInt(reader.readLine());
		int c_500 = 0;
		int c_100 = 0;
		int c_50 = 0;
		int c_10 = 0;
		int c_5 = 0;
		int c_1 = 0;
		int count = 0;
		
		c_500 = money / 500;
		c_100 = (money - c_500 * 500) / 100;
		c_50 = (money - c_500 * 500 - c_100 * 100) / 50;
		c_10 = (money - c_500 * 500 - c_100 * 100 - c_50 * 50) / 10;
		c_5 = (money - c_500 * 500 - c_100 * 100 - c_50 * 50 - c_10 * 10) / 5;
		c_1 = (money - c_500 * 500 - c_100 * 100 - c_50 * 50 - c_10 * 10 - c_5 * 5);
		count = c_500 + c_100 + c_50 + c_10 + c_5 + c_1;
		
		System.out.println(count);
		reader.close();
	}
}
