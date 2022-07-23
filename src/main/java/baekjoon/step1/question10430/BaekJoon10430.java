package baekjoon.step1.question10430;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon10430 {
	public static void main(String[] args) {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {

			String StL = in.readLine();
			String St[] = StL.split(" ");

			int A = Integer.parseInt(St[0]);
			int B = Integer.parseInt(St[1]);
			int C = Integer.parseInt(St[2]);

			System.out.println((A + B) % C);
			System.out.println((A % C + B % C) % C);
			System.out.println((A * B) % C);
			System.out.println((A % C * B % C) % C);
			
		} catch (Exception e) {
			System.out.println("실패");
		}
		
	}
}
