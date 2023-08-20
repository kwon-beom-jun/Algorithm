package baekjoon.step10001_20000.step14001_15000.step14901_15000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14912 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int num = Integer.parseInt(arr[0]);
		char check = arr[1].charAt(0);
		
		for (int i = 1; i <= num; i++) {
			sb.append(i);
		}
		
		char n[] = sb.toString().toCharArray();
		
		int cnt = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == check) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}
