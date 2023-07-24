package baekjoon.step20001_30000.step24001_25000.step24401_24500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24416_Succes_Final {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		System.out.println(fib(num) + " " + (num-2));
		in.close();
	}
	
	static public int fib(int n) {
		
		int dp[] = new int[n];
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n-1];
	}
}
