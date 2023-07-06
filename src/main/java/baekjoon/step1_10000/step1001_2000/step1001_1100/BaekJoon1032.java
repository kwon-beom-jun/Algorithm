package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1032 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		char arr[] = in.readLine().toCharArray();

		char fileName[];
		for (int i = 1; i < num; i++) {
			fileName = in.readLine().toCharArray();
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != '?') {
					if (arr[j] != fileName[j]) {
						arr[j] = '?';
					}
				}
			}
		}
		
		for (char c : arr) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
