package baekjoon.step10001_20000.step15001_16000.step15601_15700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15649 {
	
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
		
		dfs(N, M, 0);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void dfs(int N, int M, int depth) {
		 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}
	 
	 
		for (int i = 0; i < N; i++) {
	 
			if (visit[i] == false) {
				
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
	            
				visit[i] = false;
			}
		}
		return;
	}
}
