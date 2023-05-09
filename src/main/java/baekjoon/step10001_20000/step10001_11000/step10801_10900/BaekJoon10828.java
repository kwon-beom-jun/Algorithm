package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon10828 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine()), size;
		ArrayList<Integer> stack = new ArrayList<>();
		
		for (int i = 0; i < num; i++) {
			
			String command = in.readLine();
			
			if (command.indexOf("push") != -1) {
				stack.add(Integer.parseInt(command.split(" ")[1]));
			} else if (command.indexOf("pop") != -1) {
				size = stack.size();
				if (size == 0) {
					sb.append(-1+"\n");
				} else {
					sb.append(stack.get(size-1)+"\n");
					stack.remove(size-1);
				}
			} else if (command.indexOf("size") != -1) {
				sb.append(stack.size()+"\n");
			} else if (command.indexOf("empty") != -1) {
				sb.append(stack.size() == 0 ? 1+"\n" : 0+"\n");
			} else if (command.indexOf("top") != -1) {
				sb.append(stack.size() == 0 ? -1+"\n" : stack.get(stack.size()-1)+"\n");
			}
			
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}