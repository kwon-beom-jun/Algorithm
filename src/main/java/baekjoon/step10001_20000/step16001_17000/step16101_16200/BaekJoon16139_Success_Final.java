package baekjoon.step10001_20000.step16001_17000.step16101_16200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon16139_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char arr[] = in.readLine().toCharArray();
		int size = arr.length+1;
		int S[][] = new int[26][size];
		
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < 26; j++) {
				S[j][i] = S[j][i-1];
			}
			S[(int)arr[i-1]-97][i]++;
		}
		
		int num = Integer.parseInt(in.readLine()), alphabet;
		String q[];
		for (int i = 0; i < num; i++) {
			q = in.readLine().split(" ");
			alphabet = (int)q[0].charAt(0);
			sb.append((S[alphabet-97][Integer.parseInt(q[2])+1]-S[alphabet-97][Integer.parseInt(q[1])])+"\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
