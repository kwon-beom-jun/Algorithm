package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 	# 핵심은 끝나는 시점
 *
 */
public class BaekJoon1931 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int N[][] = new int[num][2];
		
		String arr[];
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			N[i][0] = Integer.parseInt(arr[0]);
			N[i][1] = Integer.parseInt(arr[1]);
		}
		
		Arrays.sort(N, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
			}
		});
		
		int afterTime = N[0][1];
		int cnt = 1;
		for (int i = 1; i < N.length; i++) {
			if (afterTime <= N[i][0]) {
				afterTime = N[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}