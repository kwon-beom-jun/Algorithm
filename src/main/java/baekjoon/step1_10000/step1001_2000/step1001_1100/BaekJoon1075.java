package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1075 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine()) / 100 * 100;
		int F = Integer.parseInt(in.readLine());
		
		for (; N % F != 0; N++);
		
		System.out.println(N % 100 < 10 ? "0" + N % 100 : N % 100);
		in.close();
	}
}
