package baekjoon.step1_10000.step5001_6000.step5401_5500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 풀이
 * 		1. 순수 배열 사용
 * 		2. 배열의 크기가 최대 100,000 이므로 메모리를 많이 사용
 *		3. 시간 복잡도 : O(n^3)
 *
 */
public class BaekJoon5430_Fail_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine()), testCase[], tempArr[];
		String str, arr[], p[];
		
		for (int i = 0; i < num; i++) {
			p = in.readLine().split(""); 
			testCase = new int[Integer.parseInt(in.readLine())];
			str = in.readLine().replace("[", "").replace("]", "");
			arr = str.split(",");
			
			for (int j = 0; j < testCase.length; j++) {
				testCase[j] = Integer.parseInt(arr[j]);
			}
			
			try {
				for (int j = 0; j < p.length; j++) {
					if (p[j].equals("R")) {
						tempArr = new int[testCase.length];
						for (int x = testCase.length-1, z = 0; x >= 0; x--, z++) {
							tempArr[z] = testCase[x];
						}
						for (int x = 0; x < testCase.length; x++) {
							testCase[x] = tempArr[x];
						}
					} else {
						tempArr = new int[testCase.length-1];
						for (int x = 1; x < testCase.length; x++) {
							tempArr[x-1] = testCase[x];
						}
						testCase = new int[tempArr.length];
						for (int x = 0; x < tempArr.length; x++) {
							testCase[x] = tempArr[x];
						}
					}
				}
			} catch (Exception e) {
				sb.append("error\n");
				continue;
			}
			
			sb.append(Arrays.toString(testCase)+"\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
