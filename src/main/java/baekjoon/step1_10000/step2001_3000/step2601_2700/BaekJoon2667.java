package baekjoon.step1_10000.step2001_3000.step2601_2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BaekJoon2667 {
	
	static boolean visit[][];
	static char arr[][];
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		int point[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
		
		arr = new char[N][N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.readLine().toCharArray();
		}
		
		visit = new boolean[N][N];
		List<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == '1' && !visit[i][j]) {
					int cnt = 0;
					Queue<Integer[]> queue = new LinkedList<>();
					queue.offer(new Integer[] {i, j});
					visit[i][j] = true;
					
					while (queue.size() != 0) {
						Integer[] temp = queue.poll();
						int x = temp[0];
						int y = temp[1];
						cnt++;
						
						for (int[] check : point) {
							if (check(x + check[0], y + check[1])) {
								queue.offer(new Integer[] {x + check[0], y + check[1]});
								visit[x + check[0]][y + check[1]] = true;
							}
						}
					}
					
					answer.add(cnt);
				}
			}
		}
		
		answer.sort(null);
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer.size()).append("\n");
		for (int n : answer) {
			sb.append(n).append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	static boolean check(int x, int y) {
		return x >= 0 && y >= 0 && x < N && y < N && arr[x][y] == '1' && !visit[x][y];
	}
}
