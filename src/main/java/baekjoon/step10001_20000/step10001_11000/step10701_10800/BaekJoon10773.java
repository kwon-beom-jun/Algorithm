package baekjoon.step10001_20000.step10001_11000.step10701_10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10773 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int K = Integer.parseInt(in.readLine()), num, result = 0;
		
		for (int i = 0; i < K; i++) {
			num = Integer.parseInt(in.readLine());
			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		
		for (int i = 0; i < stack.size(); i++) {
			result += stack.get(i);
		}
		
		System.out.println(result);
		in.close();
	}
}
