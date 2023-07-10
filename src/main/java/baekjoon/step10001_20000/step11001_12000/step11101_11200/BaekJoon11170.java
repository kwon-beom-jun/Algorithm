package baekjoon.step10001_20000.step11001_12000.step11101_11200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11170 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine()), N, M, temp, cnt;
		
		String arrT[];
		for (int i = 0; i < T; i++) {
			
			arrT = in.readLine().split(" ");
			N = Integer.parseInt(arrT[0]);
			M = Integer.parseInt(arrT[1]);
			cnt = 0;
			
			while (N <= M) {
				temp = N;
				if (temp == 0) {
					cnt++;
					N++;
					continue;
				}
				while (temp != 0) {
					cnt = temp % 10 == 0 ? ++cnt : cnt;
					temp = temp / 10;
				}
				N++;
			}

			sb.append(cnt);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
