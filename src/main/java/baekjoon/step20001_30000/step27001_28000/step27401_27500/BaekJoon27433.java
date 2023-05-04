package baekjoon.step20001_30000.step27001_28000.step27401_27500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon27433 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(in.readLine());
		long sum = 1;
		
		sum = factorial(N, sum);
		
		System.out.println(sum);
		in.close();
	}
	
	public static long factorial(long N, long sum) {
		if (N != 0) {
			sum *= N;
			N = N-1;
		} else {
			return sum;
		}
		return factorial(N, sum);
	}
}
