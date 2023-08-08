package baekjoon.step20001_30000.step24001_25000.step24201_24300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		long temp = 0;
		
		/*
			n == 6 : 반복문 횟수
				4회(숫자) == 1차 FOR문 횟수(2차 FOR문 횟수)
				----------------------------------------------
				4회(10) : 3 → 4 → 5 → 6 / 4 → 5 → 6 / 5 → 6 / 6
				3회(6) : 4 → 5 → 6 / 5 → 6 / 6
				2회(2) : 5 → 6
				1회(1) : 6
				총 횟수 : 1-3-6-10
				누적 횟수 : 1-4-10-20
		 */
//		for (int i = 1; i <= n-2; i++) {
//			for (int j = i+1; j <= n-1; j++) {
//				for (int k = j+1; k <= n; k++) {
//					System.out.println(k);
//				}
//			}
//		}
		
		long answer = 0;
		for (int i = 1; i <= n-2; i++) {
			temp = temp + i;
			answer += temp;
		}

		System.out.println(answer);
		System.out.println(3);
	}
}
