package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class J13706 {

	private static void solution() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BigInteger bigInt = new BigInteger(reader.readLine());
		System.out.println(bigInt.sqrt());
		reader.close();
	}
	
	public static void main(String[] args) throws IOException {
		solution();
	}
	
}
