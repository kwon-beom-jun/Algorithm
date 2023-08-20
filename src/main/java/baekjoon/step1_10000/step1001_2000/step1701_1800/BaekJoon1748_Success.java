package baekjoon.step1_10000.step1001_2000.step1701_1800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 각 자릿수의 반복 횟수
 * 			ex)	1~9 / 10~99 / 100~999 / 1000~9999 / 10000~99999 / ...
 *				9      90      900        9000        90000      ...
 *				1	   2       3          4           5          ...
 *
 */
public class BaekJoon1748_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int arr[] = {0,9,90,900,9000,90000,900000,9000000,90000000,900000000};
		int N = Integer.parseInt(str);
		
		int cnt = 0; // 총 자릿수
		int placeValue = 0; // 사용된 수
		for (int i = 0; i < str.length(); i++) {
			cnt += arr[i]*i;
			placeValue += arr[i];
		}
		
		System.out.println(cnt + (N-placeValue)*str.length());
		in.close();
	}
}
