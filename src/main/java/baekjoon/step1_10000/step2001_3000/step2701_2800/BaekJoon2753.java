package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2753 {
	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {

			int y = Integer.parseInt(bf.readLine());
			int a = 0;

			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				a = 1;
			}

			System.out.println(a);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
