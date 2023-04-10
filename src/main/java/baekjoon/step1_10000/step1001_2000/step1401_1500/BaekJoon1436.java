package baekjoon.step1_10000.step1001_2000.step1401_1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 카운터 증가는 666이 포함되어야 함
 * 		2. 다음 카운터 증가까지 1씩 증가
 *
 */
public class BaekJoon1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int count = 1, title = 666;
		
		while (count != N) {
			title++;
			if (String.valueOf(title).indexOf("666") != -1) {
				count++;
			}
		}
		
		System.out.println(title);
		in.close();
	}
}
