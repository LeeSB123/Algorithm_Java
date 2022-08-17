package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2417 {

	private static void binarySearch(long n) {
		long start = 0;
		long end = n;
		long min = Long.MAX_VALUE;
		
		while ( start <= end ) {
			long mid = (start + end) / 2;
			long result = (long)Math.pow(mid, 2);
			
			if ( result >= n ) {
				min = mid;
				end = mid - 1;
			} else start = mid + 1;
		}
		 
		System.out.println(min);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(reader.readLine());
		binarySearch(n);
		reader.close();
		
	}
	
}
