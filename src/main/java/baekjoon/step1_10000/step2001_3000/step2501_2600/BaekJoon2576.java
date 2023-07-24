package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2576 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num, min = 101, total = 0;
		for (int i = 0; i < 7; i++) {
			num = Integer.parseInt(in.readLine());
			if (num % 2 != 0) {
				if (num < min) {
					min = num;
				}
				total += num;
			}
		}
		
		System.out.println(total == 0 ? -1 : total+"\n"+min);
		in.close();
	}
}
