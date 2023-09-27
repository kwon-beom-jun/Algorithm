package baekjoon.step1_10000.step2001_3000.step2301_2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon2346_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		String arr[] = in.readLine().split(" ");
		Deque<Integer> deque = new LinkedList<>();
		Deque<Integer> deque_place = new LinkedList<>();
		
		for (int i = 0; i < arr.length; i++) {
			deque.offer(Integer.parseInt(arr[i]));
			deque_place.offer(i+1);
		}
		
		for (int i = 0; i < N; i++) {
			int num = deque.poll();
			sb.append(deque_place.poll()).append(" ");
			if (num > 0) {
				for (int j = 0; j < num-1; j++) {
					deque.offerLast(deque.poll());
					deque_place.offerLast(deque_place.poll());
				}
			} else {
				for (int j = 0; j < Math.abs(num)-1; j++) {
					deque.offerFirst(deque.pollLast());
					deque_place.offerFirst(deque_place.poll());
				}
			}
		}
		
        System.out.println(sb.toString());
		in.close();
	}
}
