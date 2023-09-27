package baekjoon.step1_10000.step2001_3000.step2301_2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 	# ArrayDeque<>() 대신에 LinkedList<>() 사용하면 메모리 초과
 *
 */
public class BaekJoon2346_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		String arr[] = in.readLine().split(" ");
		Deque<int[]> deque = new ArrayDeque<>();
		
		for (int i = 0; i < arr.length; i++) {
			int temp[] = {Integer.parseInt(arr[i]),i+1};
			deque.offer(temp);
		}
		
		try {
			for (int i = 0; i < N; i++) {
				int temp[] = deque.poll();
				int num = temp[0];
				sb.append(temp[1]).append(" ");
				if (num > 0) {
					for (int j = 0; j < num-1; j++) {
						deque.offerLast(deque.poll());
					}
				} else {
					for (int j = 0; j < Math.abs(num); j++) {
						deque.offerFirst(deque.pollLast());
					}
				}
			}
		} catch (Exception e) {
			System.out.println(sb.toString());
			in.close();
		}
	}
}
