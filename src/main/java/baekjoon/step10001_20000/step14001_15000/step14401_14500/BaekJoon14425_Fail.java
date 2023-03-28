package baekjoon.step10001_20000.step14001_15000.step14401_14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 문제 이해
 *		1. 문자열 N개의 집합 S, 검사할 문자열 수 M
 *  
 */
// FIXME : 내부에 단어가 포함되어있으면 카운터 증가 → 단어가 일치하면 증가
public class BaekJoon14425_Fail {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		ArrayList<String> N = new ArrayList<String>();
		
		for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
			N.add(in.readLine());
		}
		
		int count = 0;
		String M = "";
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			M = in.readLine();
			for (int j = 0; j < N.size(); j++) {
				if (N.get(j).indexOf(M) != -1) {
					count += 1;
				}
			}
		}
		
		System.out.println(count);
	}
}
