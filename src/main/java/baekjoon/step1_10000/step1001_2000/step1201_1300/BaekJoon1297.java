package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1297 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		
		double H =Integer.parseInt(arr[1]);
		double W = Integer.parseInt(arr[2]);
		
		double pow = Math.pow(Integer.parseInt(arr[0]), 2) / (Math.pow(H, 2) + Math.pow(W, 2));
		double sqrt = Math.sqrt(pow);
		
		System.out.println((int)(sqrt * H) + " " + (int)(sqrt * W));
		in.close();
	}
}
