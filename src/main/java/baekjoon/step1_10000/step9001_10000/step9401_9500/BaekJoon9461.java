package baekjoon.step1_10000.step9001_10000.step9401_9500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9461{
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long before, after;
		long P[] = new long[100];

		P[0] = 1;
		P[1] = 1;
		P[2] = 1;
		for (int i = 3; i < 100; i++) {
			before = P[i-3];
			after = P[i-2];
			P[i] = before + after;
		}
		
		int num = Integer.parseInt(in.readLine());
		for (int i = 0; i < num; i++) {
			sb.append(P[Integer.parseInt(in.readLine())-1]);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}	
}
