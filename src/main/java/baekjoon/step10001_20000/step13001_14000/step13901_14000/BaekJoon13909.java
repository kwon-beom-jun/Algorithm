package baekjoon.step10001_20000.step13001_14000.step13901_14000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon13909 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int count = 1;
		
		for (int i = 2; i*i <= num; i++) {
			count++;
		}
		
		System.out.println(count);
		in.close();
	}
}
