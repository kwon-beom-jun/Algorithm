package baekjoon.step10001_20000.step11001_12000.step11001_11100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 이항 계수 'N!/K!(N-K)!' 공식 사용
 *
 */
public class BaekJoon11050 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		
		System.out.println(factorial(N)/(factorial(K)*factorial(N-K)));
		in.close();
	}
	
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
