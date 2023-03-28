package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 문제 풀이
 * 		1. 선택정렬 사용
 * 		2. 비교시 각각의 값을 문자로 분해하여 아스키코드 비교 
 * 
 */
public class BaekJoon1181_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine());
		
		String arr[] = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = in.readLine();
		}
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
		arr = hashSet.toArray(new String[0]);
		
		int place;
		String value;
		for (int i = 0; i < arr.length; i++) {
			place = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j].length() < arr[place].length()) {
					place = j;
				} else if (arr[j].length() == arr[place].length()) {
					for (int z = 0; z < arr[j].length(); z++) {
						if (arr[j].charAt(z) > arr[place].charAt(z)) {
							break;
						} else if (arr[j].charAt(z) < arr[place].charAt(z)) {
							place = j;
							break;
						}
					}
				}
			}
			if (i != place) {
				value = arr[i];
				arr[i] = arr[place];
				arr[place] = value;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}