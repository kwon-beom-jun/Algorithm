package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10996 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num*2; i++) {
			for (int j = 0; j < num; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						sb.append("*");
					} else {
						sb.append(" ");
					}
				} else {
					if (j % 2 == 0) {
						sb.append(" ");
					} else {
						sb.append("*");
					}
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
