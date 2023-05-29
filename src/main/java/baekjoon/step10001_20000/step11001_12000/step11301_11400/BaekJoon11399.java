package baekjoon.step10001_20000.step11001_12000.step11301_11400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon11399 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		String arr[] = in.readLine().split(" ");
		int N[] = new int[arr.length];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(N);
		
		int sum = 0;
		int result = 0;
		for (int i = 0; i < N.length; i++) {
			sum = sum + N[i];
			result += sum;
		}
		
		System.out.println(result);
		in.close();
	}
}
