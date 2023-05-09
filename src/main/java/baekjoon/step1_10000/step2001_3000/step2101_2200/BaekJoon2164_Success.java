package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon2164_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(in.readLine());
		boolean check = true;
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while (queue.size() != 1) {
			if (check) {
				queue.remove();
			} else {
				queue.add(queue.poll());
			}
			check = check == true ? false : true;
		}
		
		System.out.println(queue.poll());
		in.close();
	}
}