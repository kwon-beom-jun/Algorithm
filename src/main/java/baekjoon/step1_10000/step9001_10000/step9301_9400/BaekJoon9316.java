package baekjoon.step1_10000.step9001_10000.step9301_9400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9316 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= num; i++) {
			sb.append("Hello World, Judge "+i+"!\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
