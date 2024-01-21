package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1074 {
	
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);		
		int r = Integer.parseInt(arr[1]);		
		int c = Integer.parseInt(arr[2]);		
		
		recursion((int) Math.pow(2, N), r, c);
		
		System.out.println(cnt);
		in.close();
	}
	
	public static void recursion(int size, int r, int c) {
		
		if (size == 1) {
			return;
		}
		
		size = size/2;
		
		if(r < size && c < size) {
			recursion(size, r, c);
		}
		else if(r < size && c >= size) {
			cnt += size * size;
			recursion(size, r, c - size);
		}
		else if(r >= size && c < size) {
			cnt += size * size * 2;
			recursion(size, r - size, c);
		}
		else {
			cnt += size * size * 3;
			recursion(size, r - size, c - size);
		}
	}
}
