package baekjoon.step10001_20000.step14001_15000.step14801_14900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon14889 {
	
	static int N;
	static int S[][];
	static boolean visit[];
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        int arr[][] = new int[N][N];
        visit = new boolean[N+1];
        
        int temp[];
        for (int i = 0; i < N; i++) {
        	temp = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = 0; j < N; j++) {
				arr[i][j] = temp[j];
			}
		}
        
        S = new int[N][N];
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j < N; j++) {
        		S[i][j] = arr[i][j]+arr[j][i];
        	}
		}
        
        dfs(1, 1);
        
        System.out.println(min);
        in.close();
	}
	
	public static void dfs(int start, int depth) {
		
		if (depth == N/2+1) {
			int[] team1 = new int[N/2];
			int[] team2 = new int[N/2];
			int a = 0, b = 0;
			for (int i = 1; i <= N; i++) {
				if (visit[i]) {
					team1[a++] = i;
				} else {
					team2[b++] = i;
				}
			}
			int abs = Math.abs(sum(team1) - sum(team2));
			min = abs < min ? abs : min; 
			return;
		}
	 
		for (int i = start; i <= N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				dfs(i+1, depth+1);
				visit[i] = false;
			}
		}
		
		return;
	}
	
	public static int sum(int[] team) {
		int sum = 0;
		for (int i = 0; i < N/2; i++) {
			for (int j = i+1; j < N/2; j++) {
				sum += S[team[i]-1][team[j]-1];
			}
		}
		return sum;
	}
}
