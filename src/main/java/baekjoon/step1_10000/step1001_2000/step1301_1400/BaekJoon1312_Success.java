package baekjoon.step1_10000.step1001_2000.step1301_1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1312_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int N = Integer.parseInt(arr[2]);

		int cnt = 1;
		A = A % B;
		while (cnt++ != N) {
			A = A * 10 % B;
		}
		
		System.out.println(A * 10 / B);
		in.close();
	}
}
