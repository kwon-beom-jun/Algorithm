package baekjoon.step1_10000.step9001_10000.step9101_9200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	# 메모이제이션(Memoization)사용
 *  
 */
public class BaekJoon9184 {
	
	static int memoization[][][] = new int[21][21][21];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[], str;
		
		while (!(str = in.readLine()).equals("-1 -1 -1")) {
			arr = str.split(" ");
			sb.append("w("+arr[0]+", "+arr[1]+", "+arr[2]+") = ");
			sb.append(recursion(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])));
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static int recursion(int a, int b, int c) {
		
		if ( 0 <= a && a <= 20
		  && 0 <= b && b <= 20
		  && 0 <= c && c <= 20
		  && memoization[a][b][c] != 0 ) {
			
			return memoization[a][b][c];
		}
		
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if (a > 20 || b > 20 || c > 20) {
			return memoization[20][20][20] = recursion(20, 20, 20);
		}
		
		if (a < b && b < c) {
			return memoization[a][b][c] = recursion(a, b, c-1) + recursion(a, b-1, c-1) - recursion(a, b-1, c);
		}
		
		return memoization[a][b][c] = recursion(a-1, b, c) + recursion(a-1, b-1, c) + recursion(a-1, b, c-1) - recursion(a-1, b-1, c-1);
	}
}
