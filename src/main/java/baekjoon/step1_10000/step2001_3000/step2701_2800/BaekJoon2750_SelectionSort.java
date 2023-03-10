package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *	선택정렬(Selection Sort) 사용
 *		== 제자리 정렬(in-place sorthing)
 */
public class BaekJoon2750_SelectionSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[num];
		int value, place;
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		for (int i = 0; i < num; i++) {
			place = i;
			for (int j = i+1; j < num; j++) {
				if (arr[place] > arr[j]) {
					place = j;
				}
			}
			if (place != i) {
				value = arr[i];
				arr[i] = arr[place];
				arr[place] = value;
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
