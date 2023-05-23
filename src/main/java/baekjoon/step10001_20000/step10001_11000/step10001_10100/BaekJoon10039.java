package baekjoon.step10001_20000.step10001_11000.step10001_10100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10039 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, score;
		
		for (int i = 0; i < 5; i++) {
			score = Integer.parseInt(in.readLine());
			sum += score < 40 ? 40 : score;
		}
		
		System.out.println(sum/5);
		in.close();
	}
}
