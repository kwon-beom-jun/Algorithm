package baekjoon.step10001_20000.step14001_15000.step14901_15000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon14940 {
	
	static int[][] answer;
	static char[][] nm;
	static int n, m;
	
	public static void main(String[] args) throws IOException{
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");
        n = Integer.parseInt(arr[0]); 
        m = Integer.parseInt(arr[1]); 
        nm = new char[n][m];
        answer = new int[n][m];
        
        int start[] = new int[2];
        for (int i = 0; i < n; i++) {
			nm[i] = in.readLine().replace(" ", "").toCharArray();
			for (int j = 0; j < m; j++) {
				if (nm[i][j] == '2') {
					start[0] = i;
					start[1] = j;
					answer[i][j] = -1;
				} else if (nm[i][j] == '0') {
					answer[i][j] = 0;
				} else {
					answer[i][j] = -1;
				}
			}
		}
        
        dfs(start[0], start[1], 0);
        
        StringBuffer sb = new StringBuffer();
        for (int[] i : answer) {
			for (int j : i) {
				sb.append(j).append(" ");
			}
			sb.append("\n");
		}
        
        System.out.println(sb.toString());
        in.close();
	}
	
	public static void dfs(int x, int y, int deep) {
		
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		
		queue.offer(new Integer[] {x, y, deep});
		
		while (queue.size() != 0) {
			
			Integer[] arr = queue.poll();
			x = arr[0];
			y = arr[1];
			deep = arr[2];
			
			if (answer[x][y] == -1 && nm[x][y] != '0') {
				answer[x][y] = deep;
			} else if (answer[x][y] == -1 && nm[x][y] == '0') {
				answer[x][y] = 0;
			} else {
				continue;
			}
			
			if (x-1 >= 0) {
				queue.offer(new Integer[] {x-1, y, deep+1});
			}
			if (y-1 >= 0) {
				queue.offer(new Integer[] {x, y-1, deep+1});
			}
			if (x+1 < n) {
				queue.offer(new Integer[] {x+1, y, deep+1});
			}
			if (y+1 < m) {
				queue.offer(new Integer[] {x, y+1, deep+1});
			}
		}
	}
}
