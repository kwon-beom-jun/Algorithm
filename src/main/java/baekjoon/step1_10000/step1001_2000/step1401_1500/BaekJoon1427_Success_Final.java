package baekjoon.step1_10000.step1001_2000.step1401_1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon1427_Success_Final {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String num[] = in.readLine().split(""); 
		Integer arr[] = new Integer[num.length]; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int i : arr) {
			sb.append(i);
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
