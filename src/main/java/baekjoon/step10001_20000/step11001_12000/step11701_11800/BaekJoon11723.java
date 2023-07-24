package baekjoon.step10001_20000.step11001_12000.step11701_11800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11723 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(in.readLine());
		boolean S[] = new boolean[20];
		String arr[];
		int x;
		
		for (int i = 0; i < M; i++) {
			
			arr = in.readLine().split(" ");
			x = arr[0].equals("all") || arr[0].equals("empty") ? 0 : Integer.parseInt(arr[1])-1;
			
			if (arr[0].equals("add")) {
				S[x] = true;
			} else if (arr[0].equals("remove")) {
				S[x] = false;
			} else if (arr[0].equals("check")) {
				sb.append(S[x] ? 1 + "\n" : 0 + "\n");
			} else if (arr[0].equals("toggle")) {
				S[x] = S[x] ? false : true;
			} else if (arr[0].equals("all")) {
				for (int j = 0; j < S.length; j++) {
					S[j] = true;
				}
			} else if (arr[0].equals("empty")) {
				for (int j = 0; j < S.length; j++) {
					S[j] = false;
				}
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
