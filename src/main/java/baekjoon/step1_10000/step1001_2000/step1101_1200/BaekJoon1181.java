package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 아스키코드 사용
 *		2. 알파벳 소문자 아스키코드 97 ~ 122 ( 0 ~ 25 )
 * 
 */
public class BaekJoon1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		String arr[][] = new String[50][20000];
		String N;
		for (int i = 0; i < num; i++) {
			N = in.readLine();
//			System.out.println(N.length()-1);
//			System.out.println(arr[N.length()-1].length); = 20000
			for (int j = 0; j < 20000; j++) {
				if (arr[N.length()-1][j] == null) {
					arr[N.length()-1][j] = N;
					break;
				}
			}
		}
		
		
		
		in.close();
		
	}
}