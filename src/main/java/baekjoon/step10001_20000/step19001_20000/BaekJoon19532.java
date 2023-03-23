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
 * 			('x' 소거)
 * 			1*3-4*0 = 2*3-5*0 : arr 인덱스
 * 			y = (2*3-5*0)/(1*3-4*0)
 * 			x = (2-1*y)/0
 *
 * 			('y' 소거)
 * 			0*4-3*1 = 2*4-5*1 : arr 인덱스
 * 			x = (2*4-5*1)/(0*4-3*1)
 * 			y = (2-0*x)/1
 * 
 *	# x, y는 정수
 * 
 */
public class BaekJoon19532 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String abcdef[] = in.readLine().split(" ");
		int arr[] = new int[abcdef.length];
		int x = 0, y = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(abcdef[i]);
		}
		
		// a, b, d, e 값이 0인것 전부 체크
		if (arr[0] == 0) {
			y = arr[2] / arr[1];
			x = (arr[5]-arr[4]*y)/arr[3];
		} else if (arr[3] == 0) {
			y = arr[5] / arr[4];
			x = (arr[2]-arr[1]*y)/arr[0];
		} else if (arr[1] == 0) {
			x = arr[2] / arr[0];
			y = (arr[5]-arr[3]*x)/arr[4];
		} else if (arr[4] == 0) {
			x = arr[5] / arr[3];
			y = (arr[2]-arr[0]*x)/arr[1];
		} else {
			if (arr[0]*arr[3] - arr[0]*arr[3] == 0) {
				y = (arr[2]*arr[3]-arr[5]*arr[0])/(arr[1]*arr[3]-arr[4]*arr[0]);
			} else {
				y = (arr[2]*arr[3]+arr[5]*arr[0])/(arr[1]*arr[3]+arr[4]*arr[0]);
			}
			x = (arr[2]-arr[1]*y)/arr[0];
		}
		
		System.out.println(x + " " + y);
		in.close();
	}
}
