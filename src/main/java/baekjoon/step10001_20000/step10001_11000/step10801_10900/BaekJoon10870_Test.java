package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* 문제 풀이
*		1. 재귀함수(Recursion) 사용하여 재진행
*
*/
public class BaekJoon10870_Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		if (num == 0) {
			System.out.println(0);
		} else {
			Recursion(0, 1, num);
		}
		
		in.close();
	}
	
	public static void Recursion(int a, int result, int num) {
		num--;
		if (num != 0) {
			Recursion(result, a + result, num);
		} else {
			System.out.println(result);
		}
	}
}