package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J9366 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		int[] triangle = new int[3];
		
		for (int i = 1 ; i <= t ; i++) {
			String[] strTriangle = reader.readLine().split(" ");
			for (int j = 0 ; j < triangle.length ; j++) {
				triangle[j] = Integer.parseInt(strTriangle[j]);
			}
			Arrays.sort(triangle);
			
			if ( triangle[0] + triangle[1] <= triangle[2] ) {
				System.out.printf("Case #%d: ", i);
				System.out.println("invalid!");
			} else if ( triangle[0] == triangle[1] && triangle[0] == triangle[2] ) {
				System.out.printf("Case #%d: ", i);
				System.out.println("equilateral");
			} else if ( triangle[0] == triangle[1] || triangle[0] == triangle[2] || triangle[1] == triangle[2] ) {
				System.out.printf("Case #%d: ", i);
				System.out.println("isosceles");
			} else {
				System.out.printf("Case #%d: ", i);
				System.out.println("scalene");
			}
		}
		
	}
	
}
