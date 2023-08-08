package baekjoon.step20001_30000.step25001_26000.step25501_25600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. K×K 크기 시작점이 temp[i][j](temp:누적 합 테이블) 이라면 그 행의 직전 값 temp[i][j-1]과 temp[i][j+k] 비교하여 각각의 행의 변동되는 숫자 파악
 * 			1-1. temp[i][j+k] - temp[i][j-1] = 변동 값
 *		2. 첫째칸을 백으로 가정하고 누적 합 테이블을 구함
 *			2-1. 누적 합 테이블은 편리함을 위해 temp[N+1][M+1]으로 생성
 *			2-2. 누적 합 테이블은 temp[0][0~M]은 0 값으로 넣고 temp[1~N][0]은 temp[(1~N][M]값으로 설정
 *
 *		ex)			00000
 *			BBBB |	01122	WBWB
 *			BBBB |	22334	BWBW
 *			BBBW |	45567	WBWB
 *			BBWB |	778910	BWBW
 *
 *			tempW : [[0, 0, 0, 0, 0],
 *					 [0, 1, 1, 2, 2],
 *					 [2, 2, 3, 3, 4],
 *					 [4, 5, 5, 6, 7],
 *					 [7, 7, 8, 9, 10]]
 *
 * 	# 시간초과
 *
 */
public class BaekJoon25682_Fail {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int K = Integer.parseInt(arr[2]);
		char NM[][] = new char[N][M];
		int tempW[][] = new int[N+1][M+1]; // 맨 왼쪽 위 칸이 흰색 
		
		for (int i = 0; i < N; i++) {
			NM[i] = in.readLine().toCharArray();
		}
		
		// 누적 합 구하기
		int wCnt = 0;
		for (int i = 1, z = 0; i <= N; i++) {
			tempW[i][0] = wCnt;
			for (int j = 1; j <= M; j++, z++) {
				if (z % 2 == 0) {
					if (NM[i-1][j-1] == 'W') {
						tempW[i][j] = wCnt;
					} else {
						tempW[i][j] = ++wCnt;
					}
				} else {
					if (NM[i-1][j-1] == 'W') {
						tempW[i][j] = ++wCnt;
					} else {
						tempW[i][j] = wCnt;
					}
				}
			}
			if (M % 2 == 0) {
				z--;
			}
		}
		
		int min = 4000000;
		for (int i = 0; i <= N-K; i++) {
			for (int j = 0; j <= M-K; j++) {
				wCnt = 0;
				for (int z = 1+i; z <= K+i; z++) {
					wCnt += tempW[z][j+K] - tempW[z][j];
				}
				wCnt = Math.min(wCnt, (K*K)-wCnt);
				min = wCnt < min ? wCnt : min;
			}
		}
		
		System.out.println(min);
		in.close();
	}

}
