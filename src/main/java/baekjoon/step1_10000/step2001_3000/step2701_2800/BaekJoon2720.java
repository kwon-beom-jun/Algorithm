package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		int T, Q, D, N, P;
		Q = 25;
		D = 10;
		N = 5;
		P = 1;
		
		for (int i = 0; i < num; i++) {
			T = Integer.parseInt(in.readLine());
			sb.append(T/Q + " ");
			T = T%Q;
			sb.append(T/D + " ");
			T = T%D;
			sb.append(T/N + " ");
			T = T%N;
			sb.append(T/P + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
