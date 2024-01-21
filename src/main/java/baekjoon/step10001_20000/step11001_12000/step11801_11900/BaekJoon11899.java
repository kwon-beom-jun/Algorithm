package baekjoon.step10001_20000.step11001_12000.step11801_11900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11899 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char S[] = in.readLine().toCharArray();
		
		int cnt = 0;
		int check = 0;
		
		for (char cha : S) {
			if ('(' == cha) {
				check++;
			} else {
				if (check <= 0) {
					cnt++;
				} else {
					check--;
				}
			}
		}
		
		cnt += check;
		
		System.out.println(cnt);
		in.close();
	}
}
