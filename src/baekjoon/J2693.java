package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J2693 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[10];
		
		for (int i = 0 ; i < N ; i++) {
			String[] strArr = reader.readLine().split(" ");
			for (int j = 0 ; j < 10 ; j++) {
				arr[j] = Integer.parseInt(strArr[j]);
			}
			
			Arrays.sort(arr);
			System.out.println(arr[7]);
		}
		
		reader.close();
		
	}
	
}
