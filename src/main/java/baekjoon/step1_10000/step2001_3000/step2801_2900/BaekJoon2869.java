package baekjoon.step1_10000.step2001_3000.step2801_2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2869 {
	public static void main(String[] args) throws IOException {
		
		String[] question = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int A = Integer.parseInt(question[0]), B = Integer.parseInt(question[1]), C = Integer.parseInt(question[2]);
		
		System.out.println((C - B)%(A - B) == 0 ? (C - B)/(A - B) : (C - B)/(A - B) + 1);
		
	}
}
