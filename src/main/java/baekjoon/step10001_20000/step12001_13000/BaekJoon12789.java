package baekjoon.step10001_20000.step12001_13000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon12789 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		String arr[] = in.readLine().split(" ");
		
		int N[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			N[i] = Integer.parseInt(arr[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		int temp = 1, N_place = 0;
		while (N_place < num) {
			if (N[N_place] == temp) {
				N_place++;
				temp++;
			} else if (stack.size() != 0 && stack.peek() == temp) {
				stack.pop();
				temp++;
			} else {
				stack.add(N[N_place]);
				N_place++;
			}
		}
		
		num = stack.size();
		if (num != 0) {
			for (int i = 0; i < num; i++) {
				if (stack.pop() != temp++) {
					System.out.println("Sad");
					return;
				}
			}
		}
		
		System.out.println("Nice");
		in.close();
	}
}
