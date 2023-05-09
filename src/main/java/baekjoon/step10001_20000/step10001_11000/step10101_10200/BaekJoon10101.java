package baekjoon.step10001_20000.step10001_11000.step10101_10200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10101 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		int C = Integer.parseInt(in.readLine());
		
		if (A + B + C != 180) {
			System.out.println("Error");
		} else if (A == B && B == C) {
			System.out.println("Equilateral");
		} else if (A != B && B != C && C != A) {
			System.out.println("Scalene");
		} else {
			System.out.println("Isosceles");
		}

		in.close();
	}
}
