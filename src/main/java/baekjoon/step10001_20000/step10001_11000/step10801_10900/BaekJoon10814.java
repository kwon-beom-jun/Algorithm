package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 시간단축하기
 */
public class BaekJoon10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<String[]> arr = new ArrayList<>();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			arr.add(in.readLine().split(" "));
		}
		
		for (int i = 1; i <= 200; i++) {
			for (String[] value : arr) {
				if (i == Integer.parseInt(value[0])) {
					sb.append(i + " " + value[1] + "\n");
				}
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}