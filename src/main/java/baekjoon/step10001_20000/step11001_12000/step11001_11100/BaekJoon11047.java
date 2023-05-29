package baekjoon.step10001_20000.step11001_12000.step11001_11100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11047 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" "); 
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(in.readLine());
		}
		
		int cnt = 0;
		int num;
		for (int i = N-1; i >= 0; i--) {
			num = K / A[i]; 
			if (num != 0) {
				K = K - (num * A[i]);
				cnt += num;
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}
