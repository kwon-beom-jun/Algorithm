package baekjoon.step10001_20000.step18001_19000.step18201_18300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon18258 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		Integer result;
		String str = "";
		
		for (int i = 0; i < num; i++) {
			str = in.readLine();
			if (str.indexOf("push") != -1) {
				deque.add(Integer.parseInt(str.split(" ")[1]));
			} else if (str.indexOf("pop") != -1) {
				result = deque.poll();
				sb.append(result == null ? -1+"\n" : result+"\n");
			} else if (str.indexOf("size") != -1) {
				sb.append(deque.size()+"\n");
			} else if (str.indexOf("empty") != -1) {
				sb.append(deque.isEmpty() == true ? 1+"\n" : 0+"\n");
			} else if (str.indexOf("front") != -1) {
				result = deque.peekFirst();
				sb.append(result == null ? -1+"\n" : result+"\n");
			} else if (str.indexOf("back") != -1) {
				result = deque.peekLast();
				sb.append(result == null ? -1+"\n" : result+"\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
