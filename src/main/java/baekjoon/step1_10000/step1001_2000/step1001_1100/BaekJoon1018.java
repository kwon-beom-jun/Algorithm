package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. N, M은 8보다 큼
 * 		2. 8*8 넓이를 한칸씩 옆, 아래로 이동하며 체크
 * 		3. 전체 넓이를 8*8 넓이로 하나하나 체크 후 제일 적은 값으로 출력
 * 
 * 	# 32이상 출력값이 나올 수 없음
 * 	# W를 기준으로 체크 시 출력값의 반대가 B의 기준 출력
 */
public class BaekJoon1018 {
	public static void main(String argp[]) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		String board[][] = new String[Integer.parseInt(arr[0])][Integer.parseInt(arr[1])];
		String NM[];
		
		for (int i = 0; i < board.length; i++) {
			NM = in.readLine().split("");
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = NM[j];
			}
		}
		
		int result = 64;
		int check;
		
		// 세로 이동
		for (int l = 0; l < Integer.parseInt(arr[0])-7; l++) {
			// 가로 이동
			for (int w = 0; w < Integer.parseInt(arr[1])-7; w++) {
				check = 0;
				for (int j = l; j < 8+l; j++) {
					for (int z = w; z < 8+w; z++) {
						if (j % 2 == 0) {
							if (z % 2 == 0 && board[j][z].equals("W")) {
								check++;
							} else if (z % 2 == 1 && board[j][z].equals("B")) {
								check++;
							}
						} else {
							if (z % 2 == 0 && board[j][z].equals("B")) {
								check++;
							} else if (z % 2 == 1 && board[j][z].equals("W")) {
								check++;
							}
						}
					}
				}
				check = 64 - (check < 32 ? 64 - check : check);
				result = result < check ? result : check;
			}
			if (result == 0) {
				break;
			}
		}
		
		System.out.println(result);
		in.close();
	}
}
