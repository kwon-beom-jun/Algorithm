package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 메모제이션 사용
 *		2. 1의 출력되는 횟수는 파보나치의 마지막 수와 동일하고 0은 이전 파보나치의 수이다
 * 			ex)	0과 1의 총 횟수의 연관관계, 0일때는 다름
 * 				n = 0 횟수, 1 횟수
 *				1 = 0, 1
 *				2 = 1, 1
 *				3 = 1, 2
 *				4 = 2, 3
 *				5 = 3, 5
 *				6 = 5, 8
 *				7 = 8, 13
 *
 */
public class BaekJoon1003 {
	
	static Integer memozation[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int n = Integer.parseInt(in.readLine());
			
			memozation = new Integer[n+1];
			memozation[0] = 0;
			
			if (memozation.length > 1) {
				memozation[1] = 1;
				
				fibonacci(n);
				
				sb.append(memozation[n-1])
				  .append(" ")
				  .append(memozation[n])
				  .append("\n");
				
			} else {
				sb.append(1)
				  .append(" ")
				  .append(0)
				  .append("\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static int fibonacci(int n) {
		if (memozation[n] == null) {
			if (n == 0) {
				return 0;
			} else if (n == 1) {
				return 1;
			} else {
				return memozation[n] = fibonacci(n-1) + fibonacci(n-2);
			}
		}
		return memozation[n];
	}
}
