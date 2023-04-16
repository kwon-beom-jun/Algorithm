package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1085 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		
		int x = Integer.parseInt(arr[0]);
		int	y = Integer.parseInt(arr[1]);
		int	w = Integer.parseInt(arr[2]);
		int	h = Integer.parseInt(arr[3]);
		
		System.out.println(
			(x < w-x ? x : w-x) < (y < h-y ? y : h-y)
	      ? (x < w-x ? x : w-x) : (y < h-y ? y : h-y)
		);
		in.close();
	}
}
