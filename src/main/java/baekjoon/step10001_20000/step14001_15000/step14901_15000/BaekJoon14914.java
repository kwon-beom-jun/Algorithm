package baekjoon.step10001_20000.step14001_15000.step14901_15000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14914 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] arr = in.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int cnt = 1;
		
		while (true) {
			if (a % cnt == 0 && b % cnt == 0) {
				sb.append(cnt)
				  .append(" ")
				  .append(a / cnt)
				  .append(" ")
				  .append(b / cnt)
				  .append("\n");
			}
			if ((a / cnt == 1 && a % cnt == 0) ||
				(b / cnt == 1 && b % cnt == 0) ) {
				break;
			}
			cnt++;
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
