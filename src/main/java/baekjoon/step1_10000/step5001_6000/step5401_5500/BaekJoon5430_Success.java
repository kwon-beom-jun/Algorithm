package baekjoon.step1_10000.step5001_6000.step5401_5500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 순수 배열 사용
 * 		2. 배열의 크기가 최대 100,000 이므로 메모리를 많이 사용
 *		3. 시간 복잡도 : O(n^3)
 *
 *	# 풀이 중점은 시간 연산 → 두 가지 함수를 테스트 케이스에 적용하기 전 미리 계산
 *
 */
public class BaekJoon5430_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine()), testCase[], tempArr[];
		String arr[], p[];
		// 앞의 삭제 개수, 뒤의 삭제 개수, 배열 반전 ( 0:그대로, 1:반전 )
		int rmF, rmB, reversal;
		
		for (int i = 0; i < num; i++) {
			p = in.readLine().split(""); 
			testCase = new int[Integer.parseInt(in.readLine())];
			arr = in.readLine().replace("[", "").replace("]", "").split(",");
			reversal = 0; rmF = 0; rmB = 0;
			
			for (int j = 0; j < testCase.length; j++) {
				testCase[j] = Integer.parseInt(arr[j]);
			}
			
			for (int j = 0; j < p.length; j++) {
				if (p[j].equals("R")) {
					if (reversal == 0) {
						reversal = 1;
					} else {
						reversal = 0;
					}
				} else {
					if (reversal == 0) {
						rmF += 1;
					} else {
						rmB += 1;
					}
				}
			}
			
			if (testCase.length -rmF -rmB < 0) {
				sb.append("error\n");
				continue;
			}
			
			if (reversal != 0) {
				tempArr = new int[testCase.length];
				for (int x = testCase.length-1, z = 0; x >= 0; x--, z++) {
					tempArr[z] = testCase[x];
				}
				testCase = tempArr;
				
				sb.append("[");
				for (int j = rmB; j < testCase.length - rmF; j++) {
					sb.append(testCase[j]+",");
				}
				sb.append("]\n");
			} else {
				sb.append("[");
				for (int j = rmF; j < testCase.length - rmB; j++) {
					sb.append(testCase[j]+",");
				}
				sb.append("]\n");
			}
		}
		
		System.out.println(sb.toString().replaceAll(",]", "]"));
		in.close();
	}
}
