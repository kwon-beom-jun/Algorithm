package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1107 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num = in.readLine();
		int M = Integer.parseInt(in.readLine()); 
		int N = Integer.parseInt(num);
		
		if ("100".equals(num)) {
			System.out.println(0);
			return;
		} else if (M == 0) {
			System.out.println(
					num.length() < Math.abs(N - 100)
				  ?	num.length() : Math.abs(N - 100));
			return;
		} else if (M == 10) {
			System.out.println(
					Math.abs(100-N) < Math.abs(100+N)
				?   Math.abs(100-N) : Math.abs(100+N));
			return;
		}
		
		String M_arr[] = in.readLine().split(" ");
		boolean buttonNumCheck[] = new boolean[10];
		
		for (String string : M_arr) {
			buttonNumCheck[Integer.parseInt(string)] = true;
		}
		
		int result = maxNum(N, buttonNumCheck);
		int A = Math.abs(N - result) + (result+"").length();
		int B = Math.abs(N - 100);
		
		System.out.println(A < B ? A : B);
		in.close();
	}
	
	public static int maxNum(int N, boolean buttonNumCheck[]) {
		
		int result = 0, min = Integer.MAX_VALUE;
		char temp[];
		
		Loop :
		for (int i = 0; i <= (N*2 > 10 ? N*2 : 10); i++) {
			temp = (i+"").toCharArray();
			for (int j = 0; j < temp.length; j++) {
				if (buttonNumCheck[temp[j]-48]) {
					continue Loop;
				}
			}
			if (Math.abs(N-i) < min) {
				result = i;
				min = Math.abs(N-i);
			}
		}
		
		return result;
	}
}
