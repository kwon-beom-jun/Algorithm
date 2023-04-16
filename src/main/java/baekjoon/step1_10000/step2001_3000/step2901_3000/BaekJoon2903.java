package baekjoon.step1_10000.step2001_3000.step2901_3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	문제 이해
 *		1. 총 점의 갯수 : 한 변의 점의 갯수 * 한 변의 점의 갯수
 *		2. 횟수가 반복하면서 각각의 루틴을 확인
 *
 *  		횟수		사각형	점		한변의 점
 *			0		1 		4 		2	2+(0)
 *			1		4 		9 		3	2+(1)
 *			2		16 		25 		5	3+(2)
 *			3		64 		81 		9	5+(4)
 *			4		256		289 	17	9+(8)
 *			5		1024 	1089	33	17+(16)
 *
 *	# 1~ 순차적으로 *2씩 증가 방법과, '이전 한변의 점 - (이전 한변의점 - 1)' 두가지 방식이 있음
 *
 */
public class BaekJoon2903 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int count = 2;
		
		for (int i = 0; i < num; i++) {
			count = count + (count - 1);
		}
		
		System.out.println(count*count);
		in.close();
	}
}
