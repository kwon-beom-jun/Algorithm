package baekjoon.step1_10000.step9001_10000.step9901_10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 	# 메모리 초과
 *
 */
public class BaekJoon9935_Fail_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = in.readLine().toCharArray();
		String str = in.readLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();				
		
		String explosion = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			explosion = explosion + str.charAt(i);
        }
		
		int num = explosion.length();
		for (int i = 0; i < num-1; i++) {
			stack.add(arr[i]);
		}
		
		for (int i = num-1; i < arr.length; i++) {
			
			sb.setLength(0);
			stack.add(arr[i]);
			
			if (stack.size() >= num) {
				for (int j = 0; j < num; j++) {
					sb.append(stack.pop());
				}
			} else {
				continue;
			}
			
			if (sb.toString().equals(explosion)) {
				continue;
			}
				
			for (int j = num-1; j >= 0; j--) {
				stack.add(sb.charAt(j));
			}
			
		}
		
		if (stack.size() == 0) {
			System.out.println("FRULA");
		}
		
		sb.setLength(0);
		num = stack.size();
		for (int i = 0; i < num; i++) {
			sb.insert(0, stack.pop());
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
