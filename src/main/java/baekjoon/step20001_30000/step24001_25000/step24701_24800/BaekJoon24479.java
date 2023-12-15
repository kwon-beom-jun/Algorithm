package baekjoon.step20001_30000.step24001_25000.step24701_24800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon24479 {
	
	static boolean visited[];
	static int visitedOrder[];
	static int cnt = 1;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int R = Integer.parseInt(arr[2]);
		visited = new boolean[N+1];
		visitedOrder = new int[N+1];
		
		for (int i = 0; i < N+1; i++) {
			graph.add(new ArrayList<>());
		}
		
		int u, v;
		for (int i = 0; i < M; i++) {

			arr = in.readLine().split(" ");
			u = Integer.parseInt(arr[0]);
			v = Integer.parseInt(arr[1]);
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (ArrayList<Integer> list : graph) {
			Collections.sort(list);
		}
		
		visited[R] = true;
		DFS(R);
		
		for (int i = 1; i < visitedOrder.length; i++) {
			sb.append(visitedOrder[i]).append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	static public void DFS(int R) {
		
		visitedOrder[R] = cnt++;
		
		for (int i = 0; i < graph.get(R).size(); i++) {
			int nextR = graph.get(R).get(i);
			if (!visited[nextR]) {
				visited[nextR] = true;
				DFS(nextR);
			}
		}
		
		return;
	}
}
