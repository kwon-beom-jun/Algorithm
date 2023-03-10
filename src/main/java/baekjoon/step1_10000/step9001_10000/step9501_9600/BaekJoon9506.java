package baekjoon.step1_10000.step9001_10000.step9501_9600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9506 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n, count, i;
		
		while ((n = Integer.parseInt(in.readLine())) != -1) {
			
			sb.setLength(0);
			sb.append(n + " = 1");
			count = n - 1;
			
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					count -= i;
					sb.append(" + " + i);
				}
				if (count < 0) {
					break;
				}
			}
			System.out.println(count == 0 ? sb.toString() : n + " is NOT perfect.");
			
		}
		
		in.close();
	}
}
