package baekjoon.step20001_30000.step25001_26000.step25301_25400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 각각의 학생 점수들을 10,000점부터 1점까지 차례대로 비교하며 카운트
 *
 *	# 최대 계산 1,000(응시자 수) * 10,000(점수) : 10,000,000
 *	# sort 함수는 일부로 사용하지 않았음
 *  
 */
public class BaekJoon25305__final {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nk[] = in.readLine().split(" "); // 응시자 수, 커트라인
		String n[] = in.readLine().split(" "); // 점수 배열
		int k = Integer.parseInt(nk[1]); // 커트라인
		int arr[] = new int[n.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(n[i]);
		}
		
		for (int i = 10000; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					k--;
					if (k == 0) {
						System.out.println(i);
						break;
					}
				}
			}
		}
		
	}
}
