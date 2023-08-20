package baekjoon.step20001_30000.step28001_29000.step28201_28300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon28278 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(in.readLine());
		
		String temp;
		int num;
		for (int i = 0; i < N; i++) {
			
			temp = in.readLine();
			
			if ('1' == temp.charAt(0)) {
				num = Integer.parseInt(temp.split(" ")[1]);
				stack.push(num);
			} else if ('2' == temp.charAt(0)) {
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
			} else if ('3' == temp.charAt(0)) {
				sb.append(stack.size()).append("\n");;
			} else if ('4' == temp.charAt(0)) {
				sb.append(stack.isEmpty() ? 1 : 0).append("\n");;
			} else {
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
			}
			
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}