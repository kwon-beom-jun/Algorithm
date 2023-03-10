package baekjoon.step1_10000.step2001_3000.step2901_3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2908 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String question[] = reader.readLine().split(" ");
		
		int a = Integer.parseInt(String.valueOf(question[0].charAt(2))+String.valueOf(question[0].charAt(1))+String.valueOf(question[0].charAt(0)));
		int b = Integer.parseInt(String.valueOf(question[1].charAt(2))+String.valueOf(question[1].charAt(1))+String.valueOf(question[1].charAt(0)));
		
		System.out.println(a > b ? a : b);
		
	}
}
