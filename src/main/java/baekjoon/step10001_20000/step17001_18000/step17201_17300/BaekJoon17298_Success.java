package baekjoon.step10001_20000.step17001_18000.step17201_17300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon17298_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(in.readLine());
		int N[] = new int[num];
		int result[] = new int[num];
		String arr[] = in.readLine().split(" ");
		
		for (int i = 0; i < num; i++) {
			N[i] = Integer.parseInt(arr[i]);
		}
		
		for (int i = 0; i < num; i++) {
			while (stack.size() != 0 && N[stack.peek()] < N[i]) {
				result[stack.pop()] = N[i];
			}
			stack.add(i);
		}
		
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i] == 0 ? -1 : result[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
