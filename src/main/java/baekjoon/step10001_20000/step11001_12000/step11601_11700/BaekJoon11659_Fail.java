package baekjoon.step10001_20000.step11001_12000.step11601_11700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	# 1 ≤ N ≤ 100,000 | 1 ≤ M ≤ 100,000 = 10,000,000,000 횟수를 계산해야 하므로 실패
 *
 */
public class BaekJoon11659_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		String str[] = in.readLine().split(" ");
		int N[] = new int[str.length];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = Integer.parseInt(str[i]);
		}
		
		int sum;
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			sum = 0;
			str = in.readLine().split(" ");
			for (int j = Integer.parseInt(str[0])-1; j <= Integer.parseInt(str[1])-1; j++) {
				sum += N[j];
			}
			sb.append(sum+"\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
