package baekjoon.step1_10000.step7001_8000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 자신을 제외한 나머지 사람들과 비교
 *		2. 몸무게, 키 모두 자신보다 큰 사람들만 카운터
 *		3. 카운터는 곧 등수
 *
 *	# 자신과 몸무게, 키가 하나라도 같거나 작은 사람들을 제외해서 등수를 매긴다
 * 
 */
public class BaekJoon7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		int arr[][] = new int[num][2];
		String xy[];
		
		for (int i = 0; i < num; i++) {
			xy = in.readLine().split(" ");
			arr[i][0] = Integer.parseInt(xy[0]);
			arr[i][1] = Integer.parseInt(xy[1]);
		}
		
		int count;
		for (int i = 0; i < num; i++) {
			count = 1;
			for (int j = 0; j < num; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i][0] < arr[j][0]
				 && arr[i][1] < arr[j][1] ) {
					count++;
				}
			}
			sb.append(count + " ");
		}
		
		in.close();
		System.out.println(sb.toString());
	}
}
