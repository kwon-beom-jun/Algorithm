package baekjoon.step10001_20000.step18001_19000.step18101_18200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 이해
 *		1. 최소 층부터 최대 층까지 각각의 블록 제거와 쌓는 개수를 측정
 *			ex) 0 0 1 1 1 2 | 0층(5개 제거) -> 1층(2개 필요, 1개 제거) -> 2층(7개 필요)
 *
 * 	# 시간 복잡도 최대 시간 - 500 * 500 * 255 : 1억번의 계산은 약 1초로 취급
 *
 */
public class BaekJoon18110 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int B = Integer.parseInt(arr[2]);
		
		int NM[] = new int[N*M];
		
		for (int i = 0; i < N*M; i+=M) {
			arr = in.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				NM[i+j] = Integer.parseInt(arr[j]);
			}
		}
		
		Arrays.sort(NM);
		
		int minTime = Integer.MAX_VALUE, floor = 0;
		int tempTime, tempB;
		
		// 제일 낮은층부터 제일 높은층까지 검사
		for (int i = NM[0]; i < NM[NM.length-1]+1; i++) {
			
			tempTime = 0;
			tempB = B;
			
			// 오름차순으로 제거해야하는 항목부터 확인
			for (int j = NM.length-1; j >= 0; j--) {
				if (i < NM[j]) {
					tempTime += (NM[j]-i)*2; // 제거 시간
					tempB += NM[j]-i; // 제거 벽돌 수
				} else if (i > NM[j]) {
					tempTime += i-NM[j]; // 추가 시간
					tempB -= i-NM[j]; // 추가 벽돌 수
				}
				if (tempB < 0) {
					break;
				}
			}
			
			if (tempB >= 0) {
				// minTime과 tempTime 비교
				if (minTime >= tempTime) {
					minTime = tempTime;
					floor = i;
				}
			}
		}
		
		System.out.println(minTime + " " + floor);
		in.close();
	}
}
