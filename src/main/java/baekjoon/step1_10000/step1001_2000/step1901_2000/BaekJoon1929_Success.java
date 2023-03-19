package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 문제 풀이
 * 		1. 공식 Eratosthenes 사용
 * 		2. M(처음), N(끝) 숫자 추출
 * 		3. N의 크기인 boolean 배열 arr 생성
 * 		4. 소수의 배수들을 arr[]에서 전부 true로 변경
 * 			4-1. 소수의 배수들을 구할 때 소수는 'N >= 소수 * 소수' 까지만 구한다.
 * 		5. M에 해당하는 arr[] 값부터 ~ N arr[] 값까지 false(소수)만 추출 
 * 
 */
public class BaekJoon1929_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {

		StringBuilder br = new StringBuilder();
		String[] num = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int M = Integer.parseInt(num[0]);
		int N = Integer.parseInt(num[1]);
		boolean arr[] = new boolean[N];
		arr[0] = true;
		
		boolean check;
		for (int i = 2; i <= N; i++) {
			check = true;
			if (i*i > N) {
				break;
			}
			if (arr[i-1] == false) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						check = false;
						break;
					}
				}
				if (check) {
					for (int j = i*2; j <= N; j += i) {
						arr[j-1] = true;
					}
				}
			}
		}
		
		for (int i = M-1; i < arr.length; i++) {
			if (!arr[i]) {
				br.append((i+1) + "\n");
			}
		}
		
		System.out.println(br.toString());
	}
}