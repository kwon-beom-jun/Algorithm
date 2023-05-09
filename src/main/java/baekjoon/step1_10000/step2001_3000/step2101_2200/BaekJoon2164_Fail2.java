package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 마지막에 남는 카드를 구해보면
 * 			1 → 1,	2 → 2,	3 → 2
 * 			4 → 4,	5 → 4,	7 → 4
 * 			8 → 8,	15 → 8,	32 → 32
 *  	2. [ 1 → 2 → 4 → 8 → 16 ] 순으로 그 2^n 값을 구간으로 형성
 *  
 */
public class BaekJoon2164_Fail2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine()), square = 2;
		
		if (num == 1) {
			System.out.println(1);
		} else {
			while (true) {
				if (square * 2 > num) {
					break;
				} else {
					square *= 2;
				}
			}
			System.out.println(square);
		}
		
		in.close();
	}
}
