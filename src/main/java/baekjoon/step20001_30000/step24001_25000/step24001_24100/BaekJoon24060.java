package baekjoon.step20001_30000.step24001_25000.step24001_24100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24060 {
	
	static int cnt = 0;
	static int tmp[], A[], K, result;
	static boolean check = true;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		A = new int[Integer.parseInt(arr[0])];
		tmp = new int[A.length];

		K = Integer.parseInt(arr[1]);
		arr = in.readLine().split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			A[i] = Integer.parseInt(arr[i]);
		}
		
		merge_sort(0 , A.length-1);
		
		System.out.println(result == 0 ? -1 : result);
		in.close();
	}
	
	public static void merge_sort(int min, int max) {
		if (min < max) {
			int mid = (min + max) / 2;
			merge_sort(min, mid);
			merge_sort(mid + 1, max);
			marge(min, mid, max);
		}
	}
	
	public static void marge(int min, int mid, int max) {
		int i = min;
		int j = mid+1;
		int t = 0;
		
		while (i <= mid && j <= max) {
	        if (A[i] <= A[j])
	        	tmp[t++] = A[i++];
	        else 
	        	tmp[t++] = A[j++];
	    }
		while (i <= mid) {
			tmp[t++] = A[i++];
		}
		while (j <= max) {
			tmp[t++] = A[j++];
		}
		i = min;
		t = 0;
		while (i <= max) {
			A[i] = tmp[t];
			cnt++;
			if (cnt == K) {
				result = A[i];
				check = false;
			}
			i++; t++;
		}
	}
}
