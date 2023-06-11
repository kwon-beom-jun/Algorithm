package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2559 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int K = Integer.parseInt(arr[1]);
		arr = in.readLine().split(" ");
		int N[] = new int[arr.length];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(arr[i]);
		}
		
		int sum = 0, max;
		for (int i = 0; i < K; i++) {
			sum += N[i];
		}
		
		max = sum;
		
		for (int i = K; i < N.length; i++) {
			sum -= N[i-K];
			sum += N[i];
			max = max > sum ? max : sum;
		}
		
		System.out.println(max);
		in.close();
	}
}
