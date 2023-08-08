package baekjoon.step1_10000.step2001_3000.step2901_3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2960 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String NK[] = in.readLine().split(" ");
		int N = Integer.parseInt(NK[0]);
		int K = Integer.parseInt(NK[1]);
		boolean arr[] = new boolean[N+1];
		
		arr[0] = true;
		arr[1] = true;
		
		int cnt = 0;
		
		Loop :
		for (int i = 2; i <= N; i++) {
			for (int j = i; j <= N; j+=i) {
				if (!arr[j]) {
					cnt++;
					arr[j] = true;
					if (cnt == K) {
						System.out.println(j);
						break Loop;
					}
				}
			}
		}
		
		in.close();
	}
}
