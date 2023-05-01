package baekjoon.step1_10000.step4001_5000.step4901_5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon4949_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		char arr[], character;
		String str;
		boolean check;
		
		while (true) {
			
			if ((str = in.readLine()).equals(".")) {
				break;
			}
			
			stack.clear();
			arr = str.toCharArray();
			check = false;
			
			if (str.indexOf("(") == -1 &&
				str.indexOf(")") == -1 &&
				str.indexOf("[") == -1 &&
				str.indexOf("]") == -1) {
				sb.append("yes\n");
				continue;
			}
			
			try {
				for (int i = 0; i < arr.length; i++) {
					character = arr[i];
					if (character == '(' || character == '[') {
						stack.add(character);
					} else if (character == ')') {
						check = stack.pop() == '(' ? false : true;
					} else if (character == ']') {
						check = stack.pop() == '[' ? false : true;
					}
					if (check) {
						sb.append("no\n");
						break;
					}
				}
			} catch (Exception e) {
				sb.append("no\n");
				continue;
			}
			
			if (!check) {
				sb.append(stack.size() == 0 ? "yes\n" : "no\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
