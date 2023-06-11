package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10808 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char S[] = in.readLine().toCharArray();
		int result[] = new int[26];
		
		for (int i = 0; i < S.length; i++) {
			result[(int)S[i]-97]++;
		}
		
		for (int i : result) {
			sb.append(i).append(' ');
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
