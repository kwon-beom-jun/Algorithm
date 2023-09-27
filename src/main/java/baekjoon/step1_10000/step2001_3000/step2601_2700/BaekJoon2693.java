package baekjoon.step1_10000.step2001_3000.step2601_2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2693 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			String arr[] = in.readLine().split(" ");
			int temp[] = new int[arr.length];
			for (int j = 0; j < arr.length; j++) {
				temp[j] = Integer.parseInt(arr[j]);
			}
			Arrays.sort(temp);
			sb.append(temp[7]).append("\n");
		}
			
		System.out.println(sb.toString());
	}
}
