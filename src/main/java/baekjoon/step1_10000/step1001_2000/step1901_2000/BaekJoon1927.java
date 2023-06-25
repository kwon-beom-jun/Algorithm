package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BaekJoon1927 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
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
