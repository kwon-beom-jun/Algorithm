package baekjoon.step20001_30000.step25001_26000.step25501_25600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 2차원 누적합과 구간합 사용
 * 
 *			ex)	BBBB |	 1010	|	0101
 *				BBBB |	 0101	|	1010
 *				BBBW |	 1011	|	0100
 *				BBWB |	 0111	|	1000
 *
 *				tempW : [[0, 0, 0, 0, 0],
 *						 [0, 1, 1, 2, 2],
 *						 [0, 1, 2, 3, 4],
 *						 [0, 2, 3, 5, 7],
 *						 [0, 2, 4, 7, 10]]
 *
 *				tempB : [[0, 0, 0, 0, 0],
 *						 [0, 0, 1, 1, 2],
 *						 [0, 1, 2, 3, 4],
 *						 [0, 1, 3, 4, 5],
 *						 [0, 2, 4, 5, 6]]
 *
 *				B결과값 = K*K-W결과값
 *				정답 = Math(W결과값, K*K-W결과값)
 * 
 */
public class BaekJoon25682_Success {
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
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if ((i + j) % 2 == 0) {
					if (NM[i-1][j-1] == 'W') {
						tempW[i][j] = tempW[i-1][j] + tempW[i][j-1] - tempW[i-1][j-1];
					} else {
						tempW[i][j] = tempW[i-1][j] + tempW[i][j-1] - tempW[i-1][j-1] + 1;
					}
				} else {
					if (NM[i-1][j-1] == 'W') {
						tempW[i][j] = tempW[i-1][j] + tempW[i][j-1] - tempW[i-1][j-1] + 1;
					} else {
						tempW[i][j] = tempW[i-1][j] + tempW[i][j-1] - tempW[i-1][j-1];
					}
				}
			}
		}
		
		// 구간 합 구하기
		int min = 4000001, check = 0;
		for (int i = 0; i <= N-K; i++) {
			for (int j = 0; j <= M-K; j++) {
//				System.out.println("("+(K+i)+","+(K+j)+") - ("+(K+i)+","+(j)+") - ("+(i)+","+(K+j)+") + ("+i+","+j+")");
				check = tempW[K+i][K+j] - tempW[K+i][j] - tempW[i][K+j] + tempW[i][j];
				min = Math.min(min, Math.min(check, K*K-check));
			}
		}
		
		System.out.println(min);
		in.close();
	}
}
