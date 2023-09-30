package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1205 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");

		int score = Integer.parseInt(arr[1]);
		int P = Integer.parseInt(arr[2]);
		
		if (Integer.parseInt(arr[0]) == 0) {
			System.out.println(P == 0 ? -1 : 1);
			return;
		}

		int N[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		if (P == N.length && score <= N[N.length-1]) {
			System.out.println(-1);
			return;
		}
		
		int lank = 1, i = 0;
		for (; i < N.length && score < N[i]; i++, lank++);

		System.out.println(lank);
		in.close();
	}
}
