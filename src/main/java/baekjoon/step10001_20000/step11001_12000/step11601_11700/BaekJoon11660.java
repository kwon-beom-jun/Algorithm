package baekjoon.step10001_20000.step11001_12000.step11601_11700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 세로의 누적합을 구해서 문제를 해석
 * 			ex)	예시 누적 합
 * 				1	2	3	4
 * 				3	5	7	9
 *				6	9	12	15
 *				10	14	18	22
 *
 *				입력 : 2,2 / 3,4 => ((3,2)+(3,3)+(3,4))-((1,1)+(1,2)+(1,3)) => 답 : 36-9=27
 *				입력 : 1,1 / 4,4 => ((4,1)+(4,2)+(4,3)+(4,4))-0 => 답 : 64
 *
 *				코드 : x1,y1 / x2,y2 => (x2y1 ~ x2y2) - ((x1-1)y1 ~ (x1-1)y2)
 *
 */
public class BaekJoon11660 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int NN[][] = new int[N][N]; 
		
		for (int i = 0; i < 1; i++) {
			arr = in.readLine().split(" ");
			for (int j = 0; j < arr.length; j++) {
				NN[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		for (int i = 1; i < N; i++) {
			arr = in.readLine().split(" ");
			for (int j = 0; j < arr.length; j++) {
				NN[i][j] = Integer.parseInt(arr[j])+NN[i-1][j];
			}
		}
		
		int x1, x2, y1, y2, sum;
		for (int i = 0; i < M; i++) {
			sum = 0;
			arr = in.readLine().split(" ");
			x1 = Integer.parseInt(arr[0]);
			y1 = Integer.parseInt(arr[1]);
			x2 = Integer.parseInt(arr[2]);
			y2 = Integer.parseInt(arr[3]);
			
			for (int j = y1-1; j < y2; j++) {
				sum += NN[x2-1][j];
			}
			if (x1-2 != -1) {
				for (int j = y1-1; j < y2; j++) {
					sum -= NN[x1-2][j];
				}
			}
			
			sb.append(sum);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
