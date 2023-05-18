package baekjoon.step10001_20000.step11001_12000.step11701_11800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//FIXME :  히노이 탑 이어풀기
public class BaekJoon11729 {
	
	static Stack<Integer> stack1 = new Stack<>();
	static Stack<Integer> stack2 = new Stack<>();
	static Stack<Integer> stack3 = new Stack<>();
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int count = 0;
		
		for (int i = num; i > 0; i--) {
			stack1.add(i);
		}
		
		stack2.add(stack1.pop());
		hanoi(1, 2, count);
		
		in.close();
	}
	
	public static void hanoi(int before, int next, int count) {
		
		if (stack3.size() == 5) {
			cnt = cnt < count ? count : cnt;
			System.out.println(cnt);
			return;
		}
		
		if (!stack1.isEmpty() && !stack2.isEmpty() && !stack3.isEmpty()) {
			if (stack1.peek() > stack2.peek() && stack1.peek() > stack3.peek()) {
				System.out.println("stack1");
				return;
			}
			if (stack2.peek() > stack1.peek() && stack2.peek() > stack3.peek()) {
				System.out.println("stack2");
				return;
			}
			if (stack3.peek() > stack2.peek() && stack3.peek() > stack1.peek()) {
				System.out.println("stack3");
				return;
			}
		}
		
		
		
		
	}
}
