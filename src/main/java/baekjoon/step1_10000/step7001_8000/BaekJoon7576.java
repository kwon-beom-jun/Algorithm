package baekjoon.step1_10000.step7001_8000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon7576 {
	
	public static int cnt = 0, M, N;
	public static char MN[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		M = Integer.parseInt(arr[0]);
		N = Integer.parseInt(arr[1]);
		MN = new char[N][M];
		
		boolean check = true;
		Deque<Integer[]> deque = new LinkedList<>();
		
		for (int x = 0; x < N; x++) {
			arr = in.readLine().split(" ");
			for (int y = 0; y < M; y++) {
				if (arr[y].equals("1")) {
					deque.add(new Integer[]{x, y}); 
					MN[x][y] = '1';
				} else if (arr[y].equals("-1")) {
					MN[x][y] = '1';
				} else {
					MN[x][y] = '0';
					check = false;
				}
			}
		}
		
		if (check) {
			System.out.println(0);
			return;
		}
		
		bfs(deque);
		
		for (int i = 0; i < MN.length; i++) {
			for (int j = 0; j < MN[i].length; j++) {
				if (MN[i][j] == '0') {
					check = true;
				}
			}
		}
		
		if (check) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(cnt-1);
		in.close();
	}
	
	public static void bfs(Deque<Integer[]> deque) {

		while (deque.size() != 0) {
			
			cnt++;
			int num = deque.size();
			
			for (int i = 0; i < num; i++) {
				
				Integer[] arr = deque.pollFirst();
				int x = arr[0];
				int y = arr[1];
				
				// 위
				if (x-1 >= 0 && MN[x-1][y] != '1') {
					deque.addLast(new Integer[]{x-1, y});
					MN[x-1][y] = '1';
				}
				
				// 아래
				if (x+1 <= N-1 && MN[x+1][y] != '1') {
					deque.addLast(new Integer[]{x+1, y});
					MN[x+1][y] = '1';
				}
				
				// 왼쪽
				if (y-1 >= 0 && MN[x][y-1] != '1') {
					deque.addLast(new Integer[]{x, y-1});
					MN[x][y-1] = '1';
				}
				
				// 오른쪽
				if (y+1 <= M-1 && MN[x][y+1] != '1') {
					deque.addLast(new Integer[]{x, y+1});
					MN[x][y+1] = '1';
				}
			}
		}
	}
}
