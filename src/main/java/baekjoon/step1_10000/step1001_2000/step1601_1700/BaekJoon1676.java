package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 소인수 분해 사용
 *		2. 연속된 수를 곱하게 되면 2가 5보다 작으므로 2의 배수가 더 많음
 *
 */
public class BaekJoon1676 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int cnt = 0, temp;
		
		for (int i = 1; i <= num; i++) {
			temp = i;
			while (temp % 5 == 0) {
				temp /= 5;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}
