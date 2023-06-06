package baekjoon.step1_10000.step4001_5000.step4101_4200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4101 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str, arr[];
		
		while (!((str = in.readLine()).equals("0 0"))) {
			arr = str.split(" ");
			sb.append(Integer.parseInt(arr[0]) > Integer.parseInt(arr[1]) ? "Yes\n" : "No\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
