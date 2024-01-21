package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1912 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int max = -1000;
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
			max = max < sum ? sum : max; 
			if (sum < 0) {
				sum = 0;
			}
		}
		
		System.out.println(max);
		in.close();
	}
}
