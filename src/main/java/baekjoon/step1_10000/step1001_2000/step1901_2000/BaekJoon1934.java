package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1934 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		String arr[];
		int A, B;
		
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			A = Integer.parseInt(arr[0]);
			B = Integer.parseInt(arr[1]);
			sb.append(A * B / Euclid(A, B) + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static long Euclid(int A, int B) {
		int tmp = A;
		while (B % A != 0) {
			tmp = B % A;
			B = A;
			A = tmp;
		}
		return tmp;
	}
}
