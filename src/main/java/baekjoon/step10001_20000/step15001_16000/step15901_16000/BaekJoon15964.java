package baekjoon.step10001_20000.step15001_16000.step15901_16000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15964 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[]= in.readLine().split(" ");
		long A = Integer.parseInt(arr[0]);
		long B = Integer.parseInt(arr[1]);
		
		System.out.println((A+B)*(A-B));
		in.close();
	}
}
