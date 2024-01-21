package baekjoon.step20001_30000.step21001_22000.step21701_21800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon21736 {
	
	static Queue<Integer[]> queue;
	static char[][] arr;
	static int cnt = 0;
	static int N, M;
	static boolean visit[][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = in.readLine().split(" ");
		
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		visit = new boolean[N][M];
		
		arr = new char[N][];
		queue = new LinkedList<Integer[]>();
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == 'I') {
					queue.offer(new Integer[] {i, j});
				}
			}
		}
		
		while (queue.size() != 0) {
			Integer[] temp = queue.poll();
			int x = temp[0];
			int y = temp[1];
			bfs(x+1, y);
			bfs(x-1, y);
			bfs(x, y+1);
			bfs(x, y-1);
		}
		
		System.out.println(cnt == 0 ? "TT" : cnt);
		in.close();
	}
	
	static void bfs(int x, int y) {
		if (x >= 0 && y >= 0 && x < N && y < M) {
			if (!visit[x][y]) {
				visit[x][y] = true;
				if (arr[x][y] != 'X') {
					if (arr[x][y] == 'P') {
						cnt++;
					}
					queue.offer(new Integer[] {x, y});
				}
			}
		}
	}
}
