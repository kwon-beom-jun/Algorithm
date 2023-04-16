package baekjoon.step10001_20000.step13001_14000.step13201_13300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 문제 풀이
*		1. 유클리드 호제법을 이용
*
*	# 최소 공배수는 공약수를 이용하는 방법과 지수를 이용하는 방법 두가지가 있다
*
*/
public class BaekJoon13241 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		long A = Integer.parseInt(arr[0]), B = Integer.parseInt(arr[1]);
		
		if (A >= B) {
			System.out.println(A * B / Euclid(A, B));
		} else if (A < B) {
			System.out.println(A * B / Euclid(B, A));
		}
		
		in.close();
	}
	
	public static long Euclid(long A, long B) {
		long tmp = B;
		while (A % B != 0) {
			tmp = A % B;
			A = B;
			B = tmp;
		}
		return tmp;
	}
}