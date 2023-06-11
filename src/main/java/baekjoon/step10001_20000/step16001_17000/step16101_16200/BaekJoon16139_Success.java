package baekjoon.step10001_20000.step16001_17000.step16101_16200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon16139_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char arr[] = in.readLine().toCharArray(), alphabet;
		int S[][] = new int[26][arr.length];
		int cnt;
		
		for (int i = 0; i < 26; i++) {
			cnt = 0;
			alphabet = (char)(97+i);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == alphabet) {
					cnt++;
				}
				S[i][j] = cnt; 
			}
		}
		
		int num = Integer.parseInt(in.readLine()), l, r;
		String q[];
		for (int i = 0; i < num; i++) {

			q = in.readLine().split(" ");
			alphabet = q[0].charAt(0);
			r = S[((int)alphabet)-97][Integer.parseInt(q[2])];
			if (Integer.parseInt(q[1]) == 0) {
				sb.append(r+"\n");
			} else {
				l = S[((int)alphabet)-97][Integer.parseInt(q[1])-1];
				sb.append((r-l)+"\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
