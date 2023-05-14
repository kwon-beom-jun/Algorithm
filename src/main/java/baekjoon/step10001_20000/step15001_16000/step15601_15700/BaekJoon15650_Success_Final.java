package baekjoon.step10001_20000.step15001_16000.step15601_15700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	# 재귀 시 다음 시작점을 인자로 넘겨줌
 * 	# arr 배열을 덮어쓰며 진행
 *
 */
public class BaekJoon15650_Success_Final {
	
	static int N;
	static int M;
	static boolean[] visit;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String NM[] = in.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		visit = new boolean[N];
		arr = new int[M];
		
		dfs(1, 0);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void dfs(int start, int depth) {
		 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}
	 
	 
		for (int i = start; i <= N; i++) {
			arr[depth] = i;
 			dfs(i+1, depth + 1);
		}
		
		return;
	}
}
