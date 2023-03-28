package baekjoon.step1_10000.step5001_6000.step5001_5100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5073 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String triangleArr[] = new String[3];
		String triangle = "";
		int A, B, C;
		
		while (!((triangle = in.readLine()).equals("0 0 0"))) {
			
			triangleArr = triangle.split(" ");
			A = Integer.parseInt(triangleArr[0]);
			B = Integer.parseInt(triangleArr[1]);
			C = Integer.parseInt(triangleArr[2]);
			
			if (A + B <= C || A + C <= B || B + C <= A) {
				System.out.println("Invalid");
			} else if (A == B && B == C) {
				System.out.println("Equilateral");
			} else if (A == B || B == C || A == C) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
			
		}
		
		in.close();
	}
}
