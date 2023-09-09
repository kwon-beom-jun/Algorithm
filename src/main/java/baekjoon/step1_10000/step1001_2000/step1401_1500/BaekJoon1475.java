package baekjoon.step1_10000.step1001_2000.step1401_1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 0 ~ 8 까지 제일 많이 사용되는 숫자가 총 세트
 *	
 *	# 9는 6으로 치환하고 /2 한 값이 최종 수
 *  
 */
public class BaekJoon1475 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char number[] = in.readLine().toCharArray();
		int arr[][] = new int[9][1];
		
		for (char c : number) {
			if (c == '9') {
				arr[c-51][0]++;
			} else {
				arr[c-48][0]++;
			}
		}
		
		arr[6][0] = arr[6][0]/2 + arr[6][0]%2;
		
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = arr[i][0] < max ? max : arr[i][0];
		}
		
		System.out.println(max);
		in.close();
	}
}
