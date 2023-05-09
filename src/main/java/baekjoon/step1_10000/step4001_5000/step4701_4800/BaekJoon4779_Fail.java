package baekjoon.step1_10000.step4001_5000.step4701_4800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 메모리 초과
 *
 */
public class BaekJoon4779_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		String str;
		int N;
		
		while ((str = in.readLine()) != null) {
			
			N = (int) Math.pow(3, Integer.parseInt(str));
			
			for (int i = 0; i < N; i++) {
				sb.append("-");
			}
			
			result.append(division(sb.toString(), N) + "\n");
		}
		
		System.out.println(result.toString());
		in.close();
	}
	
	public static String division(String str, int num) {

		if (str.length() != 1) {
			
			num = num/3;
			StringBuilder sb = new StringBuilder(str);
			
			for (int i = num; i < num*2; i++) {
				sb.setCharAt(i, ' ');
			}
			str = sb.toString();
			sb = null;
			
			return division(str.substring(0, num), num) + str.substring(num, num*2) + division(str.substring(num*2, num*3), num);
		}
		
		return str;
	}
}
