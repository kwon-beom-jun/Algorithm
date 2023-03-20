package baekjoon.step1_10000.step2001_3000.step2201_2300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 이해
 * 		1. 입력값 N(분해합)이 자연수 M보다 낮을 수 없음
 * 		2. 입력값 만큼 for문
 * 		3. for문의 초기값 변수를 분해하여 합
 * 		4. 합한 값이 N과 같을 시 for문 탈출
 * 
 *	# for문을 돌리면서 초기값 변수를 자리수로 분해하여 합하고 N과 비교하는 방식
 *	# 분해시 String 값으로 처리하기 보단 숫자 상태로 처리
 * 
 */
public class BaekJoon2231_Final {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int result = 0, check;

		for (int i = 1; i <= num ; i++) {
			result = i;
			check = i;
			while (check != 0) {
				result += check % 10;
				check /= 10;
			}
			if (result == num) {
				result = i;
				break;
			}
			result = 0;
		}
		
		System.out.println(result);
		in.close();
	}
}
