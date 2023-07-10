package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1259 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		Loop :
		while (!((str = in.readLine()).equals("0"))) {
			for (int i = 0; i < str.length()/2; i++) {
				if (str.charAt(i) != str.charAt(str.length()-i-1)) {
					sb.append("no\n");
					continue Loop;
				}
			}
			sb.append("yes\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
