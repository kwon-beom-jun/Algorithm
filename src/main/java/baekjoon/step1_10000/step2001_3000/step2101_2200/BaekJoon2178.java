package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2178 {
	
	static char[][] graph;
	static int[][] xy = {{-1,0}, {0,-1}, {1,0}, {0,1}};
	static int[][] answer;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		N = Integer.parseInt(arr[0]);
		M = Integer.parseInt(arr[1]);
		answer = new int[N][M];
		
		graph = new char[N][];
		for (int i = 0; i < N; i++) {
			graph[i] = in.readLine().toCharArray();
		}
		
		bfs();
		
		System.out.println(answer[N-1][M-1]);
		in.close();
	}
	
	public static void bfs() {
		
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		queue.offer(new Integer[] {0, 0, 1});
		answer[0][0] = 1;
		
		while (!queue.isEmpty()) {

			Integer[] arr = queue.poll();
			int x = arr[0];
			int y = arr[1];
			int deep = arr[2];
			
			for (int temp[] : xy) {
				if (check(x+temp[0], y+temp[1])) {
					queue.offer(new Integer[] {x+temp[0] , y+temp[1], deep+1});
					
					/**
					 * 중복 방지용
					 *	아래 로직이 대신 for문 전에 "answer[x][y] = deep"으로 사용 시
					 *	입력값 : 2 2
					 *	       11
					 *	       11
					 *	일때, 
					 *	deep 1 : {0, 0}
					 *	deep 2 : {1,0}, {0,1}
					 *	deep 3 : {1,1}, {1,1} // 미리 다음 deep을 넣어두지 않으면 Queue에 중복으로 들어감
					 */
					answer[x+temp[0]][y+temp[1]] = deep+1;
				}
			}
		}
	}
	
	public static boolean check(int x, int y) {
		if (x >= 0 && y >= 0 && x < N && y < M && graph[x][y] == '1' && answer[x][y] == 0) {
			return true;
		}
		return false;
	}
}
