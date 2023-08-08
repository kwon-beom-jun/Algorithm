package baekjoon.step20001_30000.step27001_28000.step27201_27300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon27294 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int T = Integer.parseInt(arr[0]);
		int S = Integer.parseInt(arr[1]);
		
		if (12 <= T && T <= 16 && S != 1) {
			System.out.println(320);
		} else {
			System.out.println(280);
		}
		
		in.close();
	}
}
