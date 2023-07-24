package baekjoon.step10001_20000.step11001_12000.step11201_11300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BaekJoon11286_Success_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int A = Math.abs(o1);
				int B = Math.abs(o2);
				return A > B ? 1 : ( A == B ? o1 > o2 ? 1 : -1 : -1 );
			}
		});
		
		int num;
		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(in.readLine());
			if (num == 0) {
				sb.append(pq.peek() == null ? 0 : pq.poll());
				sb.append("\n");
			} else {
				pq.offer(num);
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
