package baekjoon.step20001_30000.step28001_29000.step28201_28300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon28279 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		
		for (int i = 0; i < num; i++) {
			String temp = in.readLine();
			if (temp.charAt(0) == '1') {
				deque.offerFirst(Integer.parseInt(temp.split(" ")[1]));
			} else if (temp.charAt(0) == '2') {
				deque.offerLast(Integer.parseInt(temp.split(" ")[1]));
			} else if (temp.charAt(0) == '3') {
				sb.append(deque.peek() == null ? -1 : deque.pollFirst()).append("\n");
			} else if (temp.charAt(0) == '4') {
				sb.append(deque.peek() == null ? -1 : deque.pollLast()).append("\n");
			} else if (temp.charAt(0) == '5') {
				sb.append(deque.size()).append("\n");
			} else if (temp.charAt(0) == '6') {
				sb.append(deque.peek() == null ? 1 : 0).append("\n");
			} else if (temp.charAt(0) == '7') {
				sb.append(deque.peek() == null ? -1 : deque.getFirst()).append("\n");
			} else if (temp.charAt(0) == '8') {
				sb.append(deque.peek() == null ? -1 : deque.getLast()).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
