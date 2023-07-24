package baekjoon.step10001_20000.step11001_12000.step11101_11200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11179 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder(Integer.toBinaryString(num));
		
		sb.reverse();
		
		num = Integer.parseInt(sb.toString(), 2);
		
		System.out.println(num);
		in.close();
	}
}
