package baekjoon.step20001_30000.step20001_21000.step20101_20200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon20155 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine().split(" ")[0]);
		
		int arr[] = new int[N+1];
		
		for (String str : in.readLine().split(" ")) {
			arr[Integer.parseInt(str)]++;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[N]);
		in.close();
	}
}
