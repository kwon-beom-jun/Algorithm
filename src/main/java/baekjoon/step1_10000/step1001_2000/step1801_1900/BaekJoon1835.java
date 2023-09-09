package baekjoon.step1_10000.step1001_2000.step1801_1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon1835 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> queue = new LinkedList<Integer>();
		
		int num = Integer.parseInt(in.readLine());
		for (int i = 0; i < num; i++) {
			queue.offerFirst(num-i);
			for (int j = 0; j < num-i; j++) {
				queue.offerFirst(queue.pollLast());
			}
		}
		
		queue.stream().forEach(T -> sb.append(T + " "));
		
		System.out.println(sb.toString());
		in.close();
	}
}
