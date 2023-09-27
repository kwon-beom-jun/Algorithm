package baekjoon.step1_10000.step4001_5000.step4901_5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4999 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int A = in.readLine().length();
		int B = in.readLine().length();
		
		System.out.println(A < B ? "no" : "go");
		in.close();
	}
}
