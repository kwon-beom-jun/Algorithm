package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2587_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int result[] = new int[5];
		int average = 0; 
		
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(in.readLine());
			average += num;
			result[i] = num;
		}
		
		Arrays.sort(result);
		System.out.println((average /= 5) + "\n" + result[2]);
		in.close();
	}
}
