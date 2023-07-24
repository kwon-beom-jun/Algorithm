package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	# 시간 초과
 *
 */
public class BaekJoon10986_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int A[] = new int[N];
		
		arr = in.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Integer.parseInt(arr[i]);
			A[i] = sum;
		}
		
		sum = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] % M == 0) {
				sum++;
			}
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = i+0; j < N; j++) {
				if ((A[j]-A[i-1]) % M == 0) {
					sum++;
				}
			}
		}
		
		System.out.println(sum);
		in.close();
	}
}
