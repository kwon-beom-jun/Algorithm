package baekjoon.step10001_20000.step10001_11000.step10701_10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BaekJoon10866 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new ArrayDeque<>();
		int num = Integer.parseInt(in.readLine());
		String str[];
		
		for (int i = 0; i < num; i++) {
			str = in.readLine().split(" ");
			if ("push_front".equals(str[0])) {
				deque.addFirst(Integer.parseInt(str[1]));
			} else if ("push_back".equals(str[0])) {
				deque.addLast(Integer.parseInt(str[1]));
			} else if ("pop_front".equals(str[0])) {
				sb.append((deque.size() == 0 ? -1 : deque.pollFirst())+"\n");
			} else if ("pop_back".equals(str[0])) {
				sb.append((deque.size() == 0 ? -1 : deque.pollLast())+"\n");
			} else if ("size".equals(str[0])) {
				sb.append(deque.size()+"\n");
			} else if ("empty".equals(str[0])) {
				sb.append((deque.isEmpty() ? 1 : 0)+"\n");
			} else if ("front".equals(str[0])) {
				sb.append((deque.size() == 0 ? -1 : deque.peekFirst())+"\n");
			} else if ("back".equals(str[0])) {
				sb.append((deque.size() == 0 ? -1 : deque.peekLast())+"\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
