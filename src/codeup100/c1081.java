package codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class c1081 {
    public static void main(String[] args) throws IOException {
//  sol1 Memory 14396 Runtime 115
//    	Scanner input = new Scanner(System.in);
//    	int x = input.nextInt();
//    	int y = input.nextInt();
//    	
//    	for (int i = 1 ; i <= x ; i++) {
//    		for (int j = 1 ; j <= y ; j++) {
//    			System.out.println(i + " " + j);
//    		}
//    	}
//    	input.close();
    	
//	sol2 Memory 11828 Runtime 75
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String data[] = input.readLine().split(" ");
        
        int x = Integer.parseInt(data[0]);
        int y = Integer.parseInt(data[1]);
        
        for (int i = 1 ; i <= x ; i++) {
            for (int j = 1 ; j <= y ; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}