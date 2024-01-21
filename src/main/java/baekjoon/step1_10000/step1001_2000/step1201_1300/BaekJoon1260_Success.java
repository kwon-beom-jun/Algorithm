package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BaekJoon1260_Success {
	
	static boolean[] visit;
	static List<Integer[]> list;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int V = Integer.parseInt(arr[2]);
		
		list = new ArrayList<Integer[]>(); 
		
		for (int i = 0; i < M; i++) {
			arr = in.readLine().split(" ");
			list.add(new Integer[] {Integer.parseInt(arr[0]), Integer.parseInt(arr[1])});
			list.add(new Integer[] {Integer.parseInt(arr[1]), Integer.parseInt(arr[0])});
		}
		
		Comparator<Integer[]> arrayComparator = new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0].equals(o2[0])) {
                    return Integer.compare(o1[1], o2[1]); // 첫 번째 요소가 같을 경우 두 번째 요소 비교
                }
                return Integer.compare(o1[0], o2[0]); // 첫 번째 요소로 비교
            }
        };
		
        Collections.sort(list, arrayComparator);
        
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
		for (Integer[] xy : list) {
			int x = xy[0];
			int y = xy[1];
			if (x == V) {
				if (!visit[y]) {
					dfs(y);
				}
			}
		}
	}
	
	public static void bfs(int V) {
		
		Queue<Integer[]> queue = new LinkedList<>();
		
		visit[V] = true;
		int x, y;
		
		for (Integer[] xy : list) {
			x = xy[0];
			y = xy[1];
			if (x == V) {
				queue.offer(new Integer[] {x, y});
			}
		}
		
		sb.append(V +" ");
		while (queue.size() != 0) {
			Integer[] xy = queue.poll();
			x = xy[1];
			if (!visit[x]) {
				visit[x] = true;
				for (Integer[] temp : list) {
					int a = temp[0];
					int b = temp[1];
					if (x == a) {
						queue.offer(new Integer[] {a, b});
					}
				}
				sb.append(x + " ");
			}
		}
	}
}
