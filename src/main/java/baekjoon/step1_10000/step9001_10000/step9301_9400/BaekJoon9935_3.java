package baekjoon.step1_10000.step9001_10000.step9301_9400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 문제 풀이
 * 		1. 메모리 초과
 *
 */
public class BaekJoon9935_3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = in.readLine();
		String explosion = in.readLine();
		char arr[] = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		int check;
		
		for (int i = 0; i < arr.length; i++) {
			stack.add(arr[i]);
			if (arr[i] == explosion.charAt(0)) {
				sb.delete(0, sb.length());
				sb.append(arr[i]);
			} else if (sb.length() != 0) {
				sb.append(arr[i]);
				if (explosion.indexOf(sb.toString()) == -1) {
					sb.delete(0, sb.length());
				}
				if (sb.toString().length() == explosion.length()) {
					for (int j = 0; j < explosion.length(); j++) {
						stack.pop();
					}
					sb.delete(0, sb.length());
					if (stack.size() != 0) {
						while (true) {
							check = stack.size()-1;
							System.out.println(stack.search(check));
							if (explosion.indexOf(stack.search(check)) != -1) {
								sb.append(stack.search(check));
							} else {
								break;
							}
							check--;
						}
					}
				}
			}
		}
		
		System.out.println();
		in.close();
	}
}
