package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon1697 {
	
	static int check[] = new int[100001];
	static int N;
	static int K;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		N = Integer.parseInt(arr[0]);
		K = Integer.parseInt(arr[1]);
		
		// K가 N보다 같거나 낮을때는 K-N이 제일 빠른 시간
		if (N >= K) {
			System.out.println(N - K);
		} else {
			bfs(N);
		}
		
		in.close();
	}
	
	public static void bfs(int N) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(N);
		check[N] = 1;
		
		while (queue.size() != 0) {
			
			int num = queue.poll();
			
			for (int i = 0; i < 3; i++) {
                
				int next = i == 0 ? num + 1 : 
						   i == 1 ? num - 1 : num * 2;
				
                if (next == K) {
                    System.out.println(check[num]);
                    return;
                }

                if (0 <= next && next < 100001 && check[next] == 0) {
                    check[next] = check[num] + 1;
                    queue.add(next);
                }
            }
		}
	}
}
