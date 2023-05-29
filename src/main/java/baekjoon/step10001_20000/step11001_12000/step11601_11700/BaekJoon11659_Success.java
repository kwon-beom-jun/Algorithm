package baekjoon.step10001_20000.step11001_12000.step11601_11700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11659_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		String arr[] = in.readLine().split(" ");
		String str[] = in.readLine().split(" ");
		int N[] = new int[str.length+1];
		
		N[0] = 0;
		for (int i = 1; i < N.length; i++) {
			N[i] = N[i-1] + Integer.parseInt(str[i-1]);
		}

		int A, B;
		for (int i = 0; i < Integer.parseInt(arr[1]); i++) {
			str = in.readLine().split(" ");
			A = N[Integer.parseInt(str[1])];
			B = N[Integer.parseInt(str[0])-1];
			sb.append((A-B)+"\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
