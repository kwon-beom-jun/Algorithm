package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 이해
 *		1. 수의 개수 N ( 1 ≤ N ≤ 10,000,000 )
 *		2. 각 수의 값의 범위는 1 ~ 10,000 자연수
 *		3. 각 수는 중복으로 들어 갈 수 있다.
 *  
 */
public class BaekJoon10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(in.readLine());
		int arr[] = new int[10000];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(in.readLine()) - 1;
			arr[num] = arr[num] + 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				sb.append((i+1)+"\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
