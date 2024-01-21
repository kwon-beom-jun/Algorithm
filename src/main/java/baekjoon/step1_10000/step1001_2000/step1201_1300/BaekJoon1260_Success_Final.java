package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon1260_Success_Final {
	
	static boolean[] visit;
	static int[][] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = in.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);
		int V = Integer.parseInt(temp[2]);
		
		arr = new int[N+1][N+1];
		
		for (int i = 0; i < M; i++) {
			temp = in.readLine().split(" ");
			
			int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            arr[a][b] = arr[b][a] =  1;
		}
		
		visit = new boolean[N+1];
		dfs(V);
		
		sb.append("\n");
		
		visit = new boolean[N+1];
		bfs(V);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void dfs(int V) {
		visit[V] = true;
		sb.append(V + " ");
		for (int i = 0; i < arr[V].length; i++) {
            if (arr[V][i] == 1 && !visit[i])
                dfs(i);
        }
	}
	
	public static void bfs(int x) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(x);
		visit[x] = true;
		
		while (queue.size() != 0) {
			x = queue.poll();
			sb.append(x + " ");
			for (int i = 0; i < arr[x].length; i++) {
				if (arr[x][i] == 1 && !visit[i]) {
					visit[i] = true;
					queue.offer(i);
				}
			}
		}
	}
}
