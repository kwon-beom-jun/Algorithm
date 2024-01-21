package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2506 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		int cnt = 0, answer = 0;
		char arr[] = in.readLine().replaceAll(" ", "").toCharArray();
		for (int i = 0; i < num; i++) {
			if (arr[i] == '1') {
				cnt++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		
		System.out.println(answer);
		in.close();
	}
}
