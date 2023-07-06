package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2490 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		char arr[];
		char yutnori[] = {'D','C','B','A','E'};
		
		int check;
		while ((str = in.readLine()) != null) {
			check = 0;
			arr = str.toCharArray();
			for (int i = 0; i < 7; i++) {
				if (arr[i] == '1') {
					check++;
				}
			}
			sb.append(yutnori[check]);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
