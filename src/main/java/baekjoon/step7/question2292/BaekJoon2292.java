package baekjoon.step7.question2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2292 {
	public static void main(String[] args) throws IOException {
		
		/**
			1 → 7 → 19 → 37 → 61 순으로 늘어남.
			 +6  +12  +18  +24
		 */
		int result = 1;
		int check = 0;
		int roomNum = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		while (check+1 < roomNum) {
			check = check + (6*result);
			result++;
		}
		
		System.out.println(result);
		
	}
}
