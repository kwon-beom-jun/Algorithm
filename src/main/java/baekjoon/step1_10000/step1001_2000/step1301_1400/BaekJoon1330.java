package baekjoon.step1_10000.step1001_2000.step1301_1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1330 {
	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {

			String str = bf.readLine();
			String arr[] = str.split(" ");

			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);

			if (A > B) {
				System.out.println(">");
			} else if (A < B) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("단일 숫자만 입력해라");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
