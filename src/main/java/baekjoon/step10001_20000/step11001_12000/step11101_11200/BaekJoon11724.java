package baekjoon.step10001_20000.step11001_12000.step11101_11200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11724 {
	
	static boolean visited[];
	static int arr[][];
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String NM[] = in.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		arr = new int[N+1][N+1];
		
		int A, B;
		for (int i = 0; i < M; i++) {
			String AB[] = in.readLine().split(" ");
			A = Integer.parseInt(AB[0]);
			B = Integer.parseInt(AB[1]);
			arr[A][B] = arr[B][A] = 1;
		}
		
		visited = new boolean[N+1];
		
		int count = 0;
		for (int node = 1; node <= N; node++) {
			if (!visited[node]) {
				dfs(node);
				count++;
			}
		}
		
		System.out.println(count);
		in.close();
	}
	
	public static void dfs(int node) {
		
		if (visited[node]) {
			return;
		}
		
		visited[node] = true;
		for (int i = 1; i <= N; i++) {
			if (arr[node][i] == 1) {
				dfs(i);
			}
		}
		
	}
}
