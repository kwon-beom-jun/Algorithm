package baekjoon.step10001_20000.step19001_20000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 가감법 사용
 * 		2. 최소공배수 사용
 * 		3. a,b,d,e 값이 0일 경우 예외처리
 * 
 * 		예시
 * 			 x(arr[0]) + 3y(arr[1]) = -1(arr[2])
 * 			4x(arr[3]) +  y(arr[4]) =  7(arr[5])
 * 			
 * 			0*4-3*1 = 2*4-5*1 : arr 인덱스
 * 			x = (2*4-5*1)/(0*4-3*1)
 * 
 * 			1*3-4*0 = 2*3-5*0 : arr 인덱스
 * 			y = (2*3-5*0)/(1*3-4*0)
 * 
 *	# x, y는 정수
 * 
 */
public class BaekJoon19532_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String abcdef[] = in.readLine().split(" ");
		int arr[] = new int[abcdef.length];
		int x = 0, y = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(abcdef[i]);
		}
		
		System.out.println(arr[2]*arr[4]-arr[5]*arr[1]);
		System.out.println(arr[0]*arr[4]-arr[3]*arr[1]);
		
		x = (arr[2]*arr[4]-arr[5]*arr[1])/(arr[0]*arr[4]-arr[3]*arr[1]);
		y = (arr[2]*arr[3]-arr[5]*arr[0])/(arr[1]*arr[3]-arr[4]*arr[0]);
		
		System.out.println(x + " " + y);
		in.close();
	}
}
