package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon10845 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> queue = new LinkedList<>(); 
		int num = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < num; i++) {
			
			String input[] = in.readLine().split(" ");
			
			if (input.length == 2) {
				queue.offer(Integer.parseInt(input[1]));
			} else if (input[0].equals("pop")) {
				sb.append(queue.peek() == null ? -1 : queue.poll())
				  .append("\n");
			} else if (input[0].equals("size")) {
				sb.append(queue.size())
				  .append("\n");
			} else if (input[0].equals("empty")) {
				sb.append(queue.isEmpty() ? 1 : 0)
				  .append("\n");
			} else if (input[0].equals("front")) {
				sb.append(queue.peekFirst() == null ? -1 : queue.peekFirst())
				  .append("\n");
			} else if (input[0].equals("back")) {
				sb.append(queue.peekLast() == null ? -1 : queue.peekLast())
				.append("\n");
			}
			
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
