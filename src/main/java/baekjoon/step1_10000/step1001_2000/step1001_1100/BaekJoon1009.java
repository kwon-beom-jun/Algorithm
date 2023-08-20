package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1009 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			
			String arr[] = in.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int temp = a % 10;
			
			for (int j = 1; j < b; j++) {
				temp = temp * a % 10;
			}
			
			sb.append(temp == 0 ? 10 : temp).append("\n");
		}

		System.out.println(sb.toString());
		in.close();
	}
}
