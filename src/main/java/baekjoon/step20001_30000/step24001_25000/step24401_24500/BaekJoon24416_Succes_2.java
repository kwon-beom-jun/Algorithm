package baekjoon.step20001_30000.step24001_25000.step24401_24500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24416_Succes_2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		System.out.println(fib(num) + " " + (num-2));
		in.close();
	}
	
	static public int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return (fib(n-1) + fib(n-2));
		}
	}
}
