package baekjoon.step1_10000.step5001_6000.step5501_5600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5524 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			sb.append(in.readLine().toLowerCase()).append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
