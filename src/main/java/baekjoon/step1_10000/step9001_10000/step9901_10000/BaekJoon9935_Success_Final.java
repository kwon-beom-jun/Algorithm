package baekjoon.step1_10000.step9001_10000.step9901_10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9935_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = in.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();				
		
		String explosion = "";
		String str = in.readLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			explosion = explosion + str.charAt(i);
        }
		
		boolean check;
		int num = explosion.length();
		for (int i = 0; i < arr.length; i++) {
			
			check = true;
			stack.push(arr[i]);
			
			if (stack.size() >= num) {
				for (int j = 0; j < num; j++) {
					if (stack.get(stack.size()-1-j) != explosion.charAt(j)) {
						check = false;
						break;
					}
				}
				if (check) {
					for (int j = 0; j < num; j++) {
						stack.pop();
					}
				}
			}
		}

		for (char ch : stack) {
			sb.append(ch);
		}
		
		System.out.println(stack.size() == 0 ? "FRULA" : sb.toString());
		in.close();
	}
}
