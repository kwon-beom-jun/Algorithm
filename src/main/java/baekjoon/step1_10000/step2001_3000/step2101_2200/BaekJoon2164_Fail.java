package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 문제 풀이
 * 		1. 1 ~ N 값에서 버리고, 뒤로 옮기고는 작업을 싸이클마다 돌렸을 때의 예시
 * 			ex) 1234 → 24 → 4
 *  		ex) 12345678 → 2468 → 48 → 8
 *  	2. 각각의 홀수 자리 제거하여 마지막 값 도출
 *  
 */
public class BaekJoon2164_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int num = Integer.parseInt(in.readLine()), count = 0;
		
		for (int i = 1; i < num+1; i++) {
			list.add(i);
		}
		
		while (list.size() != 1) {
			if (count < list.size()) {
				list.remove(count++);
			} else {
				count = 0;
			}
		}
		
		System.out.println(list.get(0));
		in.close();
	}
}
