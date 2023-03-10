package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문제 이해
 *		1. 숫자 카드 N개, 정수 M개
 *			 N  :  1 ~ 500,000
 *			정수 : -10,000,000 ~ 10,000,000
 *		2. 동일 값이 존재하지 않음
 *  
 */
public class BaekJoon10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		in.readLine();
		String nArr[] = in.readLine().split(" ");
		ArrayList<String> nList = new ArrayList<>(Arrays.asList(nArr));
		
		in.readLine();
		String mArr[] = in.readLine().split(" ");
		
		for (String string : mArr) {
			sb.append( nList.indexOf(string) == -1 ? "0 " : "1 " );
		}
		
		System.out.println(sb.toString());
	}
}
