package baekjoon.step10001_20000.step17001_18000.step17201_17300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon17298_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		in.readLine();
		String arr[] = in.readLine().split(" ");
		int A[] = new int[arr.length], num, min = 0, max = 0;
		int result[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack_place = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		Stack<Integer> temp_place = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			A[i] = Integer.parseInt(arr[i]);
		}
		
		min = A[0];
		max = A[0];
		stack.push(A[0]);
		stack_place.push(0);
		for (int i = 1; i < A.length; i++) {
			
			num = A[i];
			
			if (num <= min) {
				min = num;
				stack.push(num);
				stack_place.push(i);
			} else if (num > max) {
				for (int j = 0; j < stack.size(); j++) {
					result[stack_place.get(j)] = num;
				}
				min = num;
				max = num;
				stack.setSize(0);
				stack_place.setSize(0);
				stack.push(num);
				stack_place.push(i);
			} else if (min < num && num <= max) {
				for (int j = 0; j < stack.size(); j++) {
					if (stack.get(j) < num) {
						result[stack_place.get(j)] = num;
					} else {
						temp.push(stack.get(j));
						temp_place.push(stack_place.get(j));
					}
				}
				min = num;
				stack.setSize(0);
				stack_place.setSize(0);
				for (int j = 0; j < temp.size(); j++) {
					stack.push(temp.get(j));
					stack_place.push(temp_place.get(j));
				}
				stack.push(num);
				stack_place.push(i);
				temp.setSize(0);
				temp_place.setSize(0);
			}
		}
		
		if (stack_place.size() != 0) {
			for (int j = 0; j < stack_place.size(); j++) {
				result[stack_place.get(j)] = -1;
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i] + " ");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
