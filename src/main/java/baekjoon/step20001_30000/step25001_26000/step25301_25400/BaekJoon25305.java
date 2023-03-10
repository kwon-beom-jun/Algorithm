package baekjoon.step20001_30000.step25001_26000.step25301_25400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 문제 풀이
 *		1. 각각의 학생 점수들을 10,000점부터 1점까지 차례대로 비교
 *		2. 비교하여 동일하면 카운트, 해당 리스트 값 제거
 *
 *	# 최대 계산 1,000(응시자 수) * 10,000(점수) : 10,000,000
 *  
 */
public class BaekJoon25305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nk[] = in.readLine().split(" "); // 응시자 수, 커트라인
		String n[] = in.readLine().split(" "); // 점수 배열
		ArrayList<Integer> arr = new ArrayList<>();
		int k = Integer.parseInt(nk[1]); // 커트라인
		
		for (int i = 0; i < n.length; i++) {
			arr.add(Integer.parseInt(n[i]));
		}
		
		for (int i = 10000; i >= 0; i--) {
			for (int j = arr.size()-1; j >= 0; j--) {
				if (arr.get(j) == i) {
					k--;
					arr.remove(j);
					if (k == 0) {
						System.out.println(i);
						break;
					}
				}
			}
		}
		
	}
}
