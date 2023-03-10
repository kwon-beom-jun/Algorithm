package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10998 {
	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {

			String StL = in.readLine();
			String St[] = StL.split(" ");

			int A = Integer.parseInt(St[0]);
			int B = Integer.parseInt(St[1]);

			System.out.println(A * B);
			
		} catch (Exception e) {
			System.out.println("실패");
		}
		
	}
}
