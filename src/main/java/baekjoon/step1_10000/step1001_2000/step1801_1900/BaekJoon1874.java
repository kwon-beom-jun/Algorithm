package baekjoon.step1_10000.step1001_2000.step1801_1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon1874 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(in.readLine()), num;
		int cnt = 1;
		Stack<Integer> stack = new Stack<>();
		
		Loop :
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(in.readLine());
			while (true) {
				if (stack.isEmpty() || stack.get(stack.size()-1) < num) {
					stack.add(cnt);
					cnt++;
					sb.append("+\n");
				} else if (stack.get(stack.size()-1) == num) {
					stack.pop();
					sb.append("-\n");
					break;
				} else {
					sb.setLength(0);
					sb.append("NO");
					break Loop;
				}
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
