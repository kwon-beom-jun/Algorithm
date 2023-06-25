package baekjoon.step10001_20000.step11001_12000.step11201_11300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon11279 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int num = Integer.parseInt(in.readLine());
		int check;
		for (int i = 0; i < num; i++) {
			check = Integer.parseInt(in.readLine());
			if (check == 0) {
				if (pq.size() == 0) {
					sb.append("0\n");
				} else {
					sb.append(pq.poll());
					sb.append("\n");
				}
			} else {
				pq.add(check);
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
