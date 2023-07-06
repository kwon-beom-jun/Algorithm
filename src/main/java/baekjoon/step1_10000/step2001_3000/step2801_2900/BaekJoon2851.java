package baekjoon.step1_10000.step2001_3000.step2801_2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2851 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int A = 0, B = 0;

		for (int i = 0; i < 10; i++) {
			A = B;
			B += Integer.parseInt(in.readLine());
			if (B >= 100) {
				break;
			}
		}
		
		System.out.println(B <= 100 ? B : (100-A) < (B-100) ? A : B);
		in.close();
	}
}
