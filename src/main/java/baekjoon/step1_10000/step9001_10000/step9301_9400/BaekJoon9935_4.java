package baekjoon.step1_10000.step9001_10000.step9301_9400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon9935_4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = in.readLine();
		String explosion = in.readLine();
		char arr[] = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			stack.add(arr[i]);
			
		}
		
		System.out.println(sb.length() == 0 ? "FRULA" : sb.toString());
		in.close();
	}
}
