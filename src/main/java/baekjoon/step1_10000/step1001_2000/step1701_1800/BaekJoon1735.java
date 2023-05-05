package baekjoon.step1_10000.step1001_2000.step1701_1800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 마지막에 최대 공약수로 나눠줘야함
 *			ex) 4/8 → 2/1
 *
 */
public class BaekJoon1735 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = in.readLine().split(" ");
		int An = Integer.parseInt(arr[0]);
		int Ad = Integer.parseInt(arr[1]);
		
		arr = in.readLine().split(" ");
		int Bn = Integer.parseInt(arr[0]);
		int Bd = Integer.parseInt(arr[1]);
		
		int n = An*Bd + Bn*Ad;
		int d = Ad*Bd;
		
		int euclid = Euclid(n, d);
		
		System.out.println(n/euclid + " " + d/euclid);
		in.close();
	}
	
	public static int Euclid(int A, int B) {
		int tmp = B;
		while (A % B != 0) {
			tmp = A % B;
			A = B;
			B = tmp;
		}
		return tmp;
	}
}
