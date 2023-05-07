package baekjoon.step10001_20000.step17001_18000.step17101_17200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 에라토스테네스의 체 사용
 * 		2. 2부터 소수들 검사
 * 			ex)	T = 10, T/2(두 소수의 순서만 다른 것은 같은 파티션이라고 정의)
 * 				[2, 10-2], [3, 7(10-3)], [5, 5(10-5)] : 3, 5 총 2가지 가능
 * 
 */
public class BaekJoon17103_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int num = Integer.parseInt(in.readLine());
		boolean decimal[] = new boolean[1000001];
		int T;
		
		// 에라토스테네스의 체
		boolean check;
		for (int i = 2; i*i <= 1000000; i++) {
			if (!decimal[i]) {
				check = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						check = false;
						break;
					}
				}
				if (check) {
					for (int j = i*2; j <= 1000000; j += i) {
						decimal[j] = true;
					}
				}
			}
		}
		
		// 파티션 검사
		int result;
		for (int i = 0; i < num; i++) {
			result = 0;
			T = Integer.parseInt(in.readLine());
			for (int j = 2; j <= T/2; j++) {
				if (!decimal[j] && !decimal[T-j]) {
					result++;
				}
			}
			sb.append(result + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
