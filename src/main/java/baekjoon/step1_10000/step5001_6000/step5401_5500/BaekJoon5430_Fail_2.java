package baekjoon.step1_10000.step5001_6000.step5401_5500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 문제 풀이
 * 		1. ArrayList 사용
 *		3. 시간 복잡도 : O(n^2)
 *
 */
public class BaekJoon5430_Fail_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> testCase;
		int num = Integer.parseInt(in.readLine());
		String str, arr[], p[];
		
		for (int i = 0; i < num; i++) {
			
			testCase = new ArrayList<>();
			p = in.readLine().split("");
			in.readLine();
			str = in.readLine().replace("[", "").replace("]", "");
			arr = str.split(",");
			
			try {
				for (int j = 0; j < arr.length; j++) {
					testCase.add(Integer.parseInt(arr[j]));
				}
			
				for (int j = 0; j < p.length; j++) {
					if (p[j].equals("R")) {
						Collections.reverse(testCase);
					} else {
						testCase.remove(0);
					}
				}
			} catch (Exception e) {
				sb.append("error\n");
				continue;
			}
			
			sb.append("[");
			for (int j = 0; j < testCase.size(); j++) {
				if (j != testCase.size()-1) {
					sb.append(testCase.get(j)+",");
				} else {
					sb.append(testCase.get(j));
				}
			}
			sb.append("]\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
