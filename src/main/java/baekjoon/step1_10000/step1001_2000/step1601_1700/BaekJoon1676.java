package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1676 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		int cnt = 0;
		int temp = 1;
		
		for (int i = 1; i <= num; i++) {
			
			temp = temp * i;
			
			while (temp % 10 == 0) {
				cnt++;
				temp /= 10;
			}
			
		}
		
        System.out.println(cnt);
	}
}
