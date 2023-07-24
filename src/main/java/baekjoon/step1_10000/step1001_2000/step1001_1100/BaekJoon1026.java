package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon1026 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int A[] = new int[num];
		Integer B[] = new Integer[num];
		String arr_1[] = in.readLine().split(" ");
		String arr_2[] = in.readLine().split(" ");

		for (int i = 0; i < num; i++) {
			A[i] = Integer.parseInt(arr_1[i]);
			B[i] = Integer.parseInt(arr_2[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B, Comparator.reverseOrder());
		
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += A[i] * B[i];
		}
		
		System.out.println(sum);
		in.close();
	}
}
