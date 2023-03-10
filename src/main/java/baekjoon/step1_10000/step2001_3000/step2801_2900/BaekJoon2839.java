package baekjoon.step1_10000.step2001_3000.step2801_2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2839 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int value = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int A = value / 5 + 1, B = 0;
		
		while (true) {
			if (5 * A == value || 5 * A + 3 * B == value) {
				break;
			}else {
				if ( 5 * A + 3 * B < value) {
					B++;
				}else {
					B = 0;
					A = A == 0 ? 0 : --A; // A-- : 반영 x 그대로 값 들어감.
				}
			}
			if (3*B>value) {
				A = -1;
				B = 0;
				break;
			}
		}
		System.out.println(A + B);
		
		
	}
}
