package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		int num[] = new int[1000], i = 1, z = 0;
		
		Loop :
		while (true) {
			for (int j = 0; j < i; j++, z++) {
				num[z] = i;
				if (z == 999) {
					break Loop;
				}
			}
			i++;
		}
		
		int sum = 0;
		for (int j = A-1; j < B; j++) {
			sum += num[j];
		}
		
		System.out.println(sum);
		in.close();
	}
}
