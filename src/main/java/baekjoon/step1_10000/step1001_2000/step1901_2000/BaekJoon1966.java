package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 풀이
 *		1. 큐 2개와 배열 1개로 풀이
 *			1-1. 큐 1 : 원본 테스트 케이스
 *			1-2. 큐 2 : 순서 케이스
 *			1-3. 배열   : 테스트 케이스 우선순위 정렬
 *		2. 원본과 순서 큐는 동일하게 미러링
 *		3. 원본 큐의 back 값과 배열 순서와 동일 → 원본, 순서 큐 poll & 배열 순서 증가
 *		4. 순서 큐에서 poll 한 값이 처음 원본 문서의 위치 값과 동일하면 종료
 *		5. poll을 몇 번이나 수행했는지 확인
 *
 */
public class BaekJoon1966 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> queueOrder = new LinkedList<>();
		int num = Integer.parseInt(in.readLine()), M, result, check, poll;
		Integer T[];
		String[] arr;
		
		
		for (int i = 0; i < num; i++) {
			
			arr = in.readLine().split(" ");
			M = Integer.parseInt(arr[1]);
			result = 0;
			
			arr = in.readLine().split(" ");
			T = new Integer[arr.length];
			for (int j = 0; j < arr.length; j++) {
				T[j] = Integer.parseInt(arr[j]);
				queue.add(T[j]);
				queueOrder.add(j);
			}
			
			Arrays.sort(T, Collections.reverseOrder());
			
			check = 0;
			poll = -1;
			while (true) {
				if (poll == M) {
					result = check;
					break;
				}
				if (queue.peek() == T[check]) {
					queue.poll();
					poll = queueOrder.poll();
					check++;
				} else {
					queue.add(queue.poll());
					queueOrder.add(queueOrder.poll());
				}
			}
			
			sb.append(result+"\n");
			queue.clear();
			queueOrder.clear();
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
