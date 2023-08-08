package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2161 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= num; i++) {
			queue.offer(i);
		}
		
		while (true) {
			sb.append(queue.poll());
			sb.append(" ");
			if (queue.isEmpty()) {
				break;
			}
			queue.offer(queue.poll());
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}