package baekjoon;

// 아! 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class J4999 {
	public static void main(String[] args) throws IOException {
//	Memory 14240kb Runtime 140ms
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String Jaehwan = reader.readLine();
		String doctor = reader.readLine();
		
		if (Jaehwan.length() >= doctor.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
		reader.close();
	}
}
