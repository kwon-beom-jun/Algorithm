package baekjoon.step10001_20000.step15001_16000.step15601_15700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// FIXME :  N과 M (3) 이어풀기
public class BaekJoon15651 {

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
		
		dfs(0);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void dfs(int depth) {
		
		for (int i = 0; i < N; i++) {
			if (depth == M) {
				if (i < N) {
					arr[depth-1] = i+1;
				}
				for (int val : arr) {
					sb.append(val + " ");
				}
				sb.append("\n");
				
				System.out.println(sb.toString());
			} else {
				depth -= i;
				arr[i+depth] = i+1;
				dfs(depth+1);
			}
		}
	}
}
