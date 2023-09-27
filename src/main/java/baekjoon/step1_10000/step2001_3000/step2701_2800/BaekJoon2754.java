package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2754 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp = in.readLine();
		float score = 0;
		
		if (temp.equals("F")) {
			System.out.println(0.0);
			return;
		}
		
		if (temp.charAt(0) == 'A') {
			score += 4;
		} else if (temp.charAt(0) == 'B') {
			score += 3;
		} else if (temp.charAt(0) == 'C') {
			score += 2;
		} else {
			score += 1;
		}
		
		score += temp.charAt(1) == '+' ? 0.3 : temp.charAt(1) == '0' ? 0 : -0.3;  
		
		System.out.println(score);
		in.close();
	}
}
