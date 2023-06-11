package baekjoon.step10001_20000.step10001_11000.step10701_10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10797 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char num = in.readLine().charAt(0);
		String arr[] = in.readLine().split(" ");
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].charAt(0) == num) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}
