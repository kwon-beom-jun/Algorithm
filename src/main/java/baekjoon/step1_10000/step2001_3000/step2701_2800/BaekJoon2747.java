package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2747 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		int temp, before1 = 1, before2 = 0;
		for (int i = 0; i < num-1; i++) {
			temp = before1;
			before1 = before1 + before2;
			before2 = temp;
		}
		
		System.out.println(before1);
		in.close();
	}
}
