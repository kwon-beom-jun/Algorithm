package baekjoon.step10001_20000.step13001_14000.step13301_13400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon13699 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		long dp[] = new long[N+1];

		if (N == 0 || N == 1) {
			System.out.println("1");
			return;
		}

		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i < N+1; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += (dp[j] * dp[i - j - 1]);
			}
		}

		System.out.println(dp[N]);
		in.close();
	}
}
