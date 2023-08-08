package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	# 지수 법칙
 *  
 */
public class BaekJoon1629 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int C = Integer.parseInt(arr[2]);

        System.out.println(division(A,B,C));
	}
	
	public static long division(int A, int B, int C) {
		
		if (B == 0) {
			return 1;
		}
		
		long result = division(A, B/2, C);
		
		return B % 2 == 0 ? result * result % C : result * result % C * A % C;
	}
}
