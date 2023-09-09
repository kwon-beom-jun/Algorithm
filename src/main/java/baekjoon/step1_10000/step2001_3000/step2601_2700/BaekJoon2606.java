package baekjoon.step1_10000.step2001_3000.step2601_2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2606 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int M = Integer.parseInt(in.readLine());
		
		String arr[];
		int graph[][] = new int[M*2+1][2];
		for (int i = 1; i <= M; i++) {
			arr = in.readLine().split(" ");
			graph[i][0] = graph[M+i][1] = Integer.parseInt(arr[0]);
			graph[i][1] = graph[M+i][0] = Integer.parseInt(arr[1]);
		}
		
		boolean visit[] = new boolean[N+1];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);

		while (!queue.isEmpty()) {
			
			int q = queue.poll();
			if (!visit[q]) {
				visit[q] = true;
				
				for (int i = 1; i <= M*2; i++) {
					if (graph[i][0] == q) {
						queue.offer(graph[i][1]);
					}
				}
			}
		}
		
		int count = -1;
		for (boolean b : visit) {
			count += b ? 1 : 0;
		}
		
		System.out.println(count == -1 ? 0 : count);
		in.close();
	}
}
