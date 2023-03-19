package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int previous = 0, next = 1, temp;
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 1; i < num; i++) {
			temp = next + previous;
			previous = next;
			next = temp;
		}
		
		if (num <= 1) {
			next = num == 0 ? 0 : 1;
		}
		
		in.close();
		System.out.println(next);
	}
}