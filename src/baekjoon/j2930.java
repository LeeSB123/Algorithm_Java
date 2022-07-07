package baekjoon;

// 가위 바위 보 
import java.util.Scanner;

public class j2930 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rnd = scan.nextInt(); 		// round
		char user[] = new char[rnd];	// 상근이 주먹가위보
		int score = 0;					// 상근이 점수
		
		for (int i = 0 ; i < rnd ; i++) {
			user[i] = scan.next().charAt(0);
		}
		
		int cnt = scan.nextInt();
		char friends[][] = new char[cnt][rnd];
		
		for (int i = 0 ; i < cnt ; i++) {
			for (int j = 0 ; j < rnd ; j++) {
				friends[i][j] = scan.next().charAt(0);	
				
				if (user[j] == 'S') {
					if (friends[i][j] == 'P') {
						score += 2;
					} else if (friends[i][j] == 'R') {
						score += 0;
					} else {
						score += 1;
					}
				}
				if (user[j] == 'P') {
					if (friends[i][j] == 'R') {
						score += 2;
					} else if (friends[i][j] == 'S') {
						score += 0;
					} else {
						score += 1;
					}
				}
				if (user[j] == 'R') {
					if (friends[i][j] == 'S') {
						score += 2;
					} else if (friends[i][j] == 'P') {
						score += 0;
					} else {
						score += 1;
					}
				}
			}
		}
		
		int max_score = 0;				// 상근이 최대점수 
		
		for (int i = 0 ; i < rnd ; i++) {
			int spr[] = {0, 0, 0};			// 0 = 가위, 1 = 보, 2 = 바위
			for (int j = 0 ; j < cnt ; j++) {
				if (friends[j][i] == 'S') {
					spr[0] += 1;
					spr[1] += 2;
					spr[2] += 0;
				}
				if (friends[j][i] == 'P') {
					spr[0] += 0;
					spr[1] += 1;
					spr[2] += 2;
				}
				if (friends[j][i] == 'R') {
					spr[0] += 2;
					spr[1] += 0;
					spr[2] += 1;
				}
			}
			max_score += Math.max(spr[0], Math.max(spr[1], spr[2]));
		}
		System.out.println(score);
		System.out.println(max_score);
		
		scan.close();
	}
}
