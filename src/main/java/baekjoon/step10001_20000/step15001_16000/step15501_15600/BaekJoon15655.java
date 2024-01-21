package baekjoon.step10001_20000.step15001_16000.step15501_15600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon15655 {
	
	static int N, M;
	static int num[], temp[];
	static StringBuilder sb = new StringBuilder();
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		N = Integer.parseInt(arr[0]);
		M = Integer.parseInt(arr[1]);
		num = new int[N];
		visit = new boolean[N];
		temp = new int[M];
		
		arr = in.readLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(num);
		
		dfs(0, 0);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void dfs(int depth, int begin) {
		
		if (depth == M) {

			for (int i : temp) {
				sb.append(i);
				sb.append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
		for (int i = begin; i < N; i++) {
			
			if (visit[i] == false) {
				visit[i] = true;
				
				temp[depth] = num[i];
				dfs(depth+1, i);
				
				visit[i] = false;
			}
		}
	}
}
