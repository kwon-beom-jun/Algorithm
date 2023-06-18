package baekjoon.step1_10000.step9001_10000.step9001_9100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9093 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		String temp[];
		char sentence[];
		
		for (int i = 0; i < num; i++) {
			temp = in.readLine().split(" ");
			for (int j = 0; j < temp.length; j++) {
				sentence = temp[j].toCharArray();
				for (int k = sentence.length-1; k >= 0; k--) {
					sb.append(sentence[k]);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
