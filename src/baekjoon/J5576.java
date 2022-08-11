package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J5576 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] w_arr = new int[10];
		int[] k_arr = new int[10];
		int w = 0, k = 0;
		
		for (int i = 0 ; i < 10 ; i++) {
			w_arr[i] = Integer.parseInt(reader.readLine());
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			k_arr[i] = Integer.parseInt(reader.readLine());
		}
		
		Arrays.sort(w_arr);
		Arrays.sort(k_arr);
		
		w = w_arr[7] + w_arr[8] + w_arr[9];
		k = k_arr[7] + k_arr[8] + k_arr[9];
		
		System.out.println(w + " " + k);
		reader.close();
		
	}
	
}
