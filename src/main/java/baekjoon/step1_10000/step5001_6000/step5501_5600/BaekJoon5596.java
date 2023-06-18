package baekjoon.step1_10000.step5001_6000.step5501_5600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5596 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int S = 0, T = 0;
		
		for (int i = 0; i < arr.length; i++) {
			S += Integer.parseInt(arr[i]);
		}

		arr = in.readLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			T += Integer.parseInt(arr[i]);
		}
		
		System.out.println(S > T ? S : T);
		in.close();
	}
}
