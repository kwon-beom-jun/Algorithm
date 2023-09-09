package baekjoon.step1_10000.step2001_3000.step2601_2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2609 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int temp = 0, LCM = A*B;
		
		// 최소 공약수
		while (B != 0) {
			temp = A % B;
			A = B;
			B = temp;
		}
		
		System.out.println(A);
		System.out.println(LCM/A);
		in.close();
	}
}
