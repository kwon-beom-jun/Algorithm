package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 나머지 분배법칙(모듈러 연산) 사용
 *			모듈러 연산
 *			- (A + B) % p = ((A % p) + (B % p)) % p
 *			- (A * B) % p = ((A % p) * (B % p)) % p
 *			- (A - B) % p = ((A % p) - (B % p) + p) % p
 *				=> ((A % p) - (B % p) + p) % p / p % p == 0
 *				=> (A + B) % p = 0 == ((A % p) - (B % p)) % p = 0
 *				=> A % p = B % p
 *		2. A % p = B % p 이므로 누적합 중 같은 나머지를 가진 2개를 순서없이 뽑는 경우의 수
 *		3. 나누기 교환법칙을 이용
 *			ex) int 배열 {1,2,3}
 *				(1 % 3) % 3 = 1 % 3 = 1
 *				(1 % 3 + 2 % 3) % 3 = (1 + 2) % 3 = 3 % 3 = 0
 *				(1 % 3 + 2 % 3 + 3 % 3) % 3 = (1 + 2 + 0) % 3 = 3 % 3 = 0
 *
 */
public class BaekJoon10986_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int S[] = new int[M]; // 누적합의 나머지
		int sum = 0;
		
		// 누적합 각각의 나머지 합계
		arr = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			// 나누기 교환법칙을 이용 
			// '%M'을 붙인 이유는 sum의 범위가 long으로도 커버가 불가능 (double이면 값이 달라짐)
			sum += Integer.parseInt(arr[i]) % M;
			S[sum%M]++;
		}
		
		long cnt = S[0]; // 구간 합이 0인 지점은 그 자체로도 1개의 답이 될 수 있음
		for (int i = 0; i < M; i++) {
			cnt += (long)S[i]*(S[i]-1)/2;
		}
		
		System.out.println(cnt);
		in.close();
	}
}
