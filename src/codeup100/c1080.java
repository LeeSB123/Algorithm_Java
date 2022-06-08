package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1080 {
	public static void main(String[] args) throws IOException {
// 	sol1 Memory 14336 Runtime 113
//		Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int i = 0;
//        int sum = 0;
//        while (sum < num) {
//            i++;
//            sum += i;
//        }
//        System.out.println(i);
//        input.close();
        
//	sol2 Memory 11176 Runtime 69
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(input.readLine());
        int sum = 0;
        int i;
        for (i = 0 ; sum < num ; i++) {
            sum += i;
        }
        System.out.println(i-1);
	}
}
