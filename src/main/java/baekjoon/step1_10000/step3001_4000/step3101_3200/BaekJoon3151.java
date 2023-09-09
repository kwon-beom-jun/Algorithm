package baekjoon.step1_10000.step3001_4000.step3101_3200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon3151 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int A[]	= Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(A);
		
		long cnt = 0; // nC3 : 10000 경우 int 범위 초과
		
		for (int z = 0; z < num; z++) {
			
			int i = z+1;
			int j = num-1;
			int sum = 0;
			
			while (i < j) {
				
				sum = A[i] + A[j];
				
				if (A[z] + sum == 0) {
					
					int temp_i = 1; // 동일 i값
					int temp_j = 1; // 동일 j값
					boolean check = false; // i~j 모든 수 동일 여부 체크 
					
					// i~j 동일 수 체크
					while (true) {
						if (A[i] == A[i+1]) {
							temp_i++;
							i++;
						} else {
							break;
						}
						if (i == j) {
							check = true;
							break;
						}
					}
					
					if (check) {
						// 모든 수가 동일하면 (j-i+1)C2
						cnt += temp_i * (temp_i-1) / 2;
						continue;
					} else {
						// 모든수가 동일하지 않다면 j도 i~j 동일 수 체크
						while (true) {
							if (A[j] == A[j-1]) {
								temp_j++;
								j--;
							} else {
								break;
							}
						}
						cnt += temp_i * temp_j; // 경우의 수는 : (i 동일한 수) x (j 동일한 수)
					}
				}
				
				if (A[z] + sum < 0) {
					i++;
				} else {
					j--;
				}
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}

