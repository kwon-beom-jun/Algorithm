package baekjoon.step20001_30000.step24001_25000.step24401_24500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24416_Succes_1 {
	
	static int code1 = 0, code2 = 0;
	static int dp[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		dp = new int[num];
		
		fib(num);
		fibonacci(num);
		
		System.out.println(code1 + " " + code2);
		in.close();
	}
	
	static public int fib(int n) {
		if (n == 1 || n == 2) {
			code1++;
			return 1;
		} else {
			return (fib(n-1) + fib(n-2));
		}
	}
	
	static public void fibonacci(int n) {
		
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i < n; i++) {
			code2++;
			dp[i] = dp[i-1] + dp[i-2];
		}
	}
}
