package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2475 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		long sum = 0, num;
		
		for (int i = 0; i < arr.length; i++) {
			num = Integer.parseInt(arr[i]);
			sum += num * num;
		}
		
		System.out.println(sum % 10);
		in.close();
	}
}
