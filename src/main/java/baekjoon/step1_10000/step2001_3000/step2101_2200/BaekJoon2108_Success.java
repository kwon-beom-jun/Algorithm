package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 이해
 * 		1. N개의 정수 : 1 ≤ N ≤ 500,000
 * 		2. 정수의 절댓값은 4,000
 *			- 산술평균 : N개의 수들의 합을 N으로 나눈 값
 *			- 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 *			- 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 *			- 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 *	
 *	# 최빈값은 정렬된 배열을 가지고 활용
 *  TIP : https://www.acmicpc.net/board/view/40713
 *  
 */
public class BaekJoon2108_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[num];
		double avg = 0;
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(in.readLine());
			avg += arr[i];
		}
		
		Arrays.sort(arr);
		
		int check = arr[0];
		int firstValue = arr[0];
		int secondValue = arr[0];
		int firstCount = -1;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (check != arr[i]) {
				if (count > firstCount) {
					firstCount = count;
					firstValue = check;
					secondValue = check;
				} else if (count == firstCount) {
					secondValue = firstValue == secondValue ? check : secondValue;
				}
				check = arr[i];
				count = 1;
			} else {
				count++;
			}
		}
		
		int result;
		if (arr.length == 1) {
			result = arr[0];
		} else {
			if (count > firstCount) {
				result = arr[arr.length-1];
			} else if (count == firstCount) {
				result = firstValue == secondValue ? arr[arr.length-1] : secondValue;
			} else {
				result = secondValue != arr[0] ? secondValue : arr[1];
			}
		}
		
		
		System.out.println(Math.round(avg/num));
		System.out.println(arr[arr.length/2]);
		System.out.println(result);
		System.out.println(Math.abs(arr[arr.length-1] - arr[0]));
	}
}
