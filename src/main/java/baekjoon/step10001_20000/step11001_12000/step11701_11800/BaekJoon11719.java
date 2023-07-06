package baekjoon.step10001_20000.step11001_12000.step11701_11800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11719 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while ((str = in.readLine()) != null) {
			sb.append(str);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
