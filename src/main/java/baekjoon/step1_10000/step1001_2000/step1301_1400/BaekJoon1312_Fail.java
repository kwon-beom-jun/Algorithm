package baekjoon.step1_10000.step1001_2000.step1301_1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	# 런타임 에러 (StringIndexOutOfBounds)
 *
 */
public class BaekJoon1312_Fail {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = in.readLine().split(" ");
		double result;
		double A = Integer.parseInt(arr[0]);
		double B = Integer.parseInt(arr[1]);
		int N = Integer.parseInt(arr[2]);
		
		result = A / B % 1;
		
		System.out.println(String.valueOf(result).charAt(N+1));
		in.close();
	}
}
