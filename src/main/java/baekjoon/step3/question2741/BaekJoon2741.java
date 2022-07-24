package baekjoon.step3.question2741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2741 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int A = Integer.parseInt(bf.readLine());
			for (int i = 1; i <= A; i++) {
				System.out.println(i);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
