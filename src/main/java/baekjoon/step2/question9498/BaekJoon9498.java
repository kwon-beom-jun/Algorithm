package baekjoon.step2.question9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9498 {
	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {

			int score = Integer.parseInt(bf.readLine());
			int scoreN = score / 10;
			String a = null;

			switch (scoreN) {
			case 10:
				a = "A";
				break;
			case 9:
				a = "A";
				break;
			case 8:
				a = "B";
				break;
			case 7:
				a = "C";
				break;
			case 6:
				a = "D";
				break;
			default:
				a = "F";
				break;
			}

			System.out.println(a);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
