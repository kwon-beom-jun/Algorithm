package baekjoon.step10001_20000.step15001_16000.step15801_15900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15813 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		char[] temp = in.readLine().toCharArray();
		
		int cnt = 0;
		for (char alphabet  : temp) {
			cnt += alphabet - 'A' + 1;
		}
		
		System.out.println(cnt);
		in.close();
	}
}
