package baekjoon.step1_10000.step1001_2000.step1401_1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1427_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String num[] = in.readLine().split(""); 
		Integer arr[] = new Integer[num.length]; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
