package baekjoon.step1_10000.step2001_3000.step2801_2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2805_Success {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		int N_arr[] = new int[N];
		
		int max = 0;
		String temp[] = in.readLine().split(" ");
		
		for (int i = 0; i < N; i++) {
			N_arr[i] = Integer.parseInt(temp[i]);
			if (max < N_arr[i]) {
				max = N_arr[i];
			}
		}
		
		int low = 0, mid = 0, high = max;
		long cnt = 0;
		
		while (low < high) {
			
			cnt = 0;
			mid = (low + high) / 2;
			
			for(int tree : N_arr) {
				if(tree - mid > 0) { 
					cnt += (tree - mid);
				}
			}
			
			if (cnt < M) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		
		System.out.println(low-1);
		in.close();
	}
}
