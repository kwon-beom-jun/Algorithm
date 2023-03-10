package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2588 {
	public static void main(String[] args) {

		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = BR.readLine();
			String str2 = BR.readLine();
			String strArr[] = str2.split("");
			int strN = Integer.parseInt(str);
			int str2N = Integer.parseInt(str2);

			System.out.println(Integer.parseInt(strArr[2]) * strN);
			System.out.println(Integer.parseInt(strArr[1]) * strN);
			System.out.println(Integer.parseInt(strArr[0]) * strN);
			System.out.println(strN * str2N);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
