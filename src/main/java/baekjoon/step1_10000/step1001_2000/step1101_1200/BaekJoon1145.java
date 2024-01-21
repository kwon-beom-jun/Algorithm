package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1145 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr);
		
		int check;
		int cnt = arr[2];

		while (true) {
			check = 0;
			for (int i = 0; i < 5; i++) {
				if (cnt % arr[i] == 0) {
					check++;
				}
			}
			if (check >= 3) {
				break;
			}
			cnt++;
		}
		
		System.out.println(cnt);
		in.close();
	}
}
