package baekjoon;

import java.util.Scanner;

public class J5554 {

	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		
		int homeSchool = scan.nextInt();
		int schoolNetcafe = scan.nextInt();
		int netcafeAcademy = scan.nextInt();
		int academyHome = scan.nextInt();
		int allTime = homeSchool + schoolNetcafe + netcafeAcademy + academyHome;
		
		System.out.println(allTime / 60);
		System.out.println(allTime % 60);
		scan.close();
		
	}
	
}
