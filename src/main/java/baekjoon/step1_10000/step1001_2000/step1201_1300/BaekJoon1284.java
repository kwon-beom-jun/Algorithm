package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1284 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String temp = "";
		char arr[];
		int cnt;
		while (!(temp = in.readLine()).equals("0")) {
			
			arr = temp.toCharArray();
			cnt = 2;
			
			for (char c : arr) {
				if (c == '0') {
					cnt += 4;
				} else if (c == '1') {
					cnt += 2;
				} else {
					cnt += 3;
				}
			}
			
			sb.append(cnt + temp.length() -1).append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
