package baekjoon.step1_10000.step1001_2000.step1501_1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1551 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int K = Integer.parseInt(arr[1]);
		arr = in.readLine().split(",");
		int N[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			N[i] = Integer.parseInt(arr[i]);
		}

		int temp[];
		for (int i = 0; i < K; i++) {
			temp = new int[N.length-i-1];
			for (int j = 0; j < N.length-i-1; j++) {
				temp[j] = N[j+1]-N[j];
				N[j] = temp[j];
			}
		}
		
		for (int i = 0; i < N.length-K; i++) {
			sb.append(N[i]);
			if (i != N.length-K-1) {
				sb.append(",");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
