package baekjoon.step10001_20000.step15001_16000.step15701_15800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	# 수열 수의 위치는 랜덤이지만 수는 1 ~ N-1까지의 1++ 정수
 *
 */
public class BaekJoon15719 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean check[] = new boolean[10000002];
		in.readLine();
		
		String N = in.readLine();
		int temp = 0;
		for (int i = 0; i < N.length(); i++) {
			if (N.charAt(i) == ' ') {
				if (check[temp]) {
					System.out.println(temp);
					return;
				}
				check[temp] = true;
				temp = 0;
			} else {
				temp = temp * 10 + (N.charAt(i)-48);
			}
		}
		
		System.out.println(temp);
		in.close();
	}
}
