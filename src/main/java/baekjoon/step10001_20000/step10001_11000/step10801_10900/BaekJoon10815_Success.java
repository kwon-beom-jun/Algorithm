package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 이해
 *		1. 숫자 카드 N개, 정수 M개
 *			 N  :  1 ~ 500,000
 *			정수 : -10,000,000 ~ 10,000,000
 *		2. 동일 값이 존재하지 않음
 *  
 */
public class BaekJoon10815_Success {
	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int nArr[] = setValue(in);
		int mArr[] = setValue(in);
		int comparing[] = new int[20000001];
		
		for (int i = 0; i < nArr.length; i++) {
			comparing[nArr[i] + 10000000] = 1;
		}
		for (int i : mArr) {
			sb.append(comparing[i+10000000] == 1 ? "1 " : "0 ");
		}
		
		System.out.println(sb.toString());
	}
	
	public static int[] setValue(BufferedReader in) {
		int result[] = null;
		try {
			in.readLine();
			String arr[] = in.readLine().split(" ");
			result = new int[arr.length];
			for (int i = 0; i < result.length; i++) {
				result[i] = Integer.parseInt(arr[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
