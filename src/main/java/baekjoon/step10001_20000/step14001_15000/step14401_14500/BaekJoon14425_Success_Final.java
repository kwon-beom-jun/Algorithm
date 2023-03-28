package baekjoon.step10001_20000.step14001_15000.step14401_14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 문제 이해
 *		1. 문자열 N개의 집합 S, 검사해야 하는 문자열 수 M
 *
 *	# Map 사용
 *  
 */
public class BaekJoon14425_Success_Final {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		HashMap<String, Integer> N = new HashMap<>();
		
		for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
			N.put(in.readLine(), 0);
		}
		
		int count = 0;
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			count = N.get(in.readLine()) != null ? count+1 : count;
		}
		
		System.out.println(count);
		in.close();
	}
}
