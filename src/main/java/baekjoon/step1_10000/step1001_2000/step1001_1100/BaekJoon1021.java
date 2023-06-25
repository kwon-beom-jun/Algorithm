package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제 이해
 * 		1. 오른쪽으로 이동하는 횟수를 구하고 Queue 사이즈에서 뺌
 * 			1-1. 최소 이동 : 이동 횟수 < (사이즈-이동 횟수) ? 이동 횟수 : (사이즈-이동 횟수)
 *	
 *	# 최솟값이 필요한것이지 이동 시 최소로 이동하라는 조건은 없음.
 *  
 */
public class BaekJoon1021 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		arr = in.readLine().split(" ");
		int extract[] = new int[M];
		for (int i = 0; i < M; i++) {
			extract[i] = Integer.parseInt(arr[i]);
		}
		
		
		int location, max, cnt, check, result = 0;
		for (int i = 0; i < M; i++) {
			
			location = extract[i];
			max = queue.size();
			cnt = 0;
			
			while (true) {
				check = queue.poll();
				if (check == location) {
					break;
				}
				queue.add(check);
				cnt++;
			}
			result += cnt < max-cnt ? cnt : max-cnt;
		}
		
		System.out.println(result);
		in.close();
	}
}