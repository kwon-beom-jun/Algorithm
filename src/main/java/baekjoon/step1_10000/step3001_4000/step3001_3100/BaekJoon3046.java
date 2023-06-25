package baekjoon.step1_10000.step3001_4000.step3001_3100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon3046 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int R1 = Integer.parseInt(arr[0]);
		int S = Integer.parseInt(arr[1]);
		
		System.out.println(S*2-R1);
		in.close();
	}
}
