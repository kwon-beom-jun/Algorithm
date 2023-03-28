package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 문제 풀이
 * 		1. Arrays.sort, Comparator 사용
 * 
 */
public class BaekJoon1181_Success_Final {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		String arr[] = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() == o2.length() ? o1.compareTo(o2)  : o1.length() - o2.length();
			}
		});
		
		sb.append(arr[0]+"\n");
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]+"\n");
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}