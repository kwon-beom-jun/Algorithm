package baekjoon.step1_10000.step4001_5000.step4101_4200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		소수를 확인 할 때는 검사하는 수의 제곱근까지만 확인
 * 
 * 	# 에라토스테네스의 체
 *	# double 지수 치환 & long 사용 이유
 *		- double 변수는 64비트 크기를 가지는 부동 소수점형 변수이고 부동 소수점 연산은 long의 정수형 연산보다 더 복잡
 *		- NumberFormat : 기본적으로 캐시를 사용하여 성능을 향상
 *		- BigDecimal : 매우 큰 숫자에서 효율적
 *
 */
public class BaekJoon4134 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		long n;
		boolean check;
		
		for (int i = 0; i < num; i++) {
			n = Long.parseLong(in.readLine());
			if (n == 0 || n == 1 || n == 2) {
				sb.append((int)2 + "\n");
				continue;
			}
			for (long j = n; ; j++) {
				check = true;
				for (long z = 2; z*z <= j ; z++) { // 제곱근 까지만 확인
					if (j % z == 0) {
						check = false;
						break;
					}
				}
				if (check) {
					sb.append(j + "\n");
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
