package baekjoon.step10001_20000.step11001_12000.step11701_11800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11721 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = in.readLine();
		char arr[] = str.toCharArray();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			sb.append(arr[i]);
			if (count % 10 == 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
