package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BaekJoon1158 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		sb.append("<");
		int cnt = 1;
		while (true) {
			if (cnt % K == 0) {
				sb.append(queue.poll());
				if (!queue.isEmpty()) {
					sb.append(", ");
				} else {
					break;
				}
			} else {
				queue.offer(queue.poll());
			}
			cnt++;
		}
		sb.append(">");

		System.out.println(sb.toString());
		in.close();
	}
}
