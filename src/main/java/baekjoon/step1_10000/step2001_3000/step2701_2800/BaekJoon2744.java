package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2744 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char arr[] = in.readLine().toCharArray();
		
		for (char ch : arr) {
			sb.append(ch > 95 ? (char)(ch-32) : (char)(ch+32));
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
