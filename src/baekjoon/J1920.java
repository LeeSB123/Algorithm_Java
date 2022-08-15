package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J1920 {

	static int n, m;
	static int[] arr;
	
	private static boolean binarySearch(int num) {
		int leftIndex = 0;
		int rightIndex = n - 1;
		
		while ( leftIndex <= rightIndex ) {
			int midIndex = (leftIndex + rightIndex) / 2;
			int mid = arr[midIndex];
			
			if ( num > mid ) leftIndex = midIndex + 1;
			else if ( num < mid ) rightIndex = midIndex - 1;
			else return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(reader.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		m = Integer.parseInt(reader.readLine());
		st = new StringTokenizer(reader.readLine());
		for (int i = 0 ; i < m ; i++) {
			int num = Integer.parseInt(st.nextToken());
			if ( binarySearch(num) ) writer.write("1\n");
			else writer.write("0\n");
		}
		
		reader.close();
		writer.flush();
		writer.close();
		
	}
	
}
