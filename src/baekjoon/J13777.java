package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J13777 {

	public static int binarySearch(int target, int start, int end) {
		int mid = (start + end) / 2;
		
		if ( mid == target ) {
			System.out.println(mid);
			return mid;
		}
		else if ( mid > target ) {
			System.out.print(mid + " ");
			return binarySearch(target, start, mid - 1);
		}
		else {
			System.out.print(mid + " ");
			return binarySearch(target, mid + 1, end);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int target = Integer.parseInt(reader.readLine());
			if ( target == 0 ) break;
			
			binarySearch(target, 1, 50);
		}
		reader.close();
		
	}
	
}
