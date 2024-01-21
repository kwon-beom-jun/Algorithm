package baekjoon.step1_10000.step1001_2000.step1401_1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이 핵심
 *		1. 재귀 조건에 충족될시 최소값을 구하려면 다른 충족되는 조건들도 재귀하여 확인
 *		2. 세가지 모두 충족되는 조건도 재귀하여 확인
 *		3. 재귀하여 나온 최솟값을 메모제이션
 *
 */
public class BaekJoon1463 {
	
	static Integer memozation[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		memozation = new Integer[num+1];
		memozation[0] = memozation[1] = 0; // 재귀 탈출시 필요
		
		ecursion(num);
		
		System.out.println(memozation[num]);
		in.close();
	}
	
	public static int ecursion(int num) {
		
		if (memozation[num] == null) {
			if (num % 6 == 0) {
				memozation[num] = Math.min(ecursion(num / 3), Math.min(ecursion(num / 2), ecursion(num - 1))) + 1;
			}else if (num % 3 == 0) {
				memozation[num] = Math.min(ecursion(num / 3), ecursion(num - 1)) + 1;
			} else if (num % 2 == 0) {
				memozation[num] = Math.min(ecursion(num / 2), ecursion(num - 1)) + 1;
			} else {
				memozation[num] = ecursion(num - 1) + 1;
			}
		}
		
		return memozation[num];
	}
}
