package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon1012 {
	
	static boolean[][] visite;
	static int M, N, K;
	static char MN[][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			
			String[] arr = in.readLine().split(" ");
			M = Integer.parseInt(arr[0]);
			N = Integer.parseInt(arr[1]);
			K = Integer.parseInt(arr[2]);
			int cnt = 0;
			
			visite = new boolean[M][N];
			MN = new char[M][N];

			for (int j = 0; j < K; j++) {
				arr = in.readLine().split(" ");
				MN[Integer.parseInt(arr[0])][Integer.parseInt(arr[1])] = '1';
			}
			
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					
					if (MN[j][k] == '1' && !visite[j][k]) {
						
						Queue<Integer[]> temp = new LinkedList<Integer[]>();
						temp.offer(new Integer[] {j, k});
						
						while (temp.size() != 0) {
							
							Integer[] xy = temp.poll();
							int x = xy[0];
							int y = xy[1];
							
							if (!visite[x][y]) {
								visite[x][y] = true;
								
								if (x-1 >= 0 && MN[x-1][y] == '1') {
									temp.offer(new Integer[] {x-1, y});
								}
								if (y-1 >= 0 && MN[x][y-1] == '1') {
									temp.offer(new Integer[] {x, y-1});
								}
								if (x+1 < M && MN[x+1][y] == '1') {
									temp.offer(new Integer[] {x+1, y});
								}
								if (y+1 < N && MN[x][y+1] == '1') {
									temp.offer(new Integer[] {x, y+1});
								}
							}
						}
						
						cnt++;
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
