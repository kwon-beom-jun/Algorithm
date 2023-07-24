package baekjoon.step10001_20000.step15001_16000.step15601_15700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15652 {
	
	static StringBuffer sb = new StringBuffer();
	static int arr[], N, M;

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String NM[] = in.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		arr = new int[M];
		
		dfs(0);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void dfs(int depth) {
		
		if (depth == M) {
			for (int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[depth] = i+1;
			if (depth != 0 && arr[depth] < arr[depth-1]) {
				continue;
			}
			dfs(depth+1);
		}
	}
}
