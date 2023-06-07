package baekjoon.step1_10000.step5001_6000.step5501_5600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5543 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num, bugger = 2000, drink = 2000;
		
		for (int i = 0; i < 3; i++) {
			num = Integer.parseInt(in.readLine());
			bugger = num < bugger ? num : bugger;
		}
		
		for (int i = 0; i < 2; i++) {
			num = Integer.parseInt(in.readLine());
			drink = num < drink ? num : drink;
		}
		
		System.out.println(bugger + drink - 50);
		in.close();
	}
}
