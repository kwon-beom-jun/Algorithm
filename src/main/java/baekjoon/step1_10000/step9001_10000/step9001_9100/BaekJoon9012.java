package baekjoon.step1_10000.step9001_10000.step9001_9100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9012 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int num = Integer.parseInt(in.readLine());
		String arr[];
		
		for (int i = 0; i < num; i++) {
			stack.clear();
			arr = in.readLine().split("");
			try {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j].equals("(")) {
						stack.add(1);
					} else {
						stack.pop();
					}
				}
			} catch (Exception e) {
				sb.append("NO\n");
				continue;
			}
			sb.append(stack.size() == 0 ? "YES\n" : "NO\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
