package baekjoon.step1_10000.step4001_5000.step4701_4800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4779_Success {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int N;
		
		while ((str = in.readLine()) != null) {
			
			N = (int) Math.pow(3, Integer.parseInt(str));
			
			for (int i = 0; i < N; i++) {
				sb.append("-");
			}
			
			division(0, N);
			
			System.out.println(sb.toString());
			sb.setLength(0);
		}
		
		in.close();
	}
	
	public static void division(int start, int len) {

		if (len >= 3) {
			
			len = len/3;
			
			for (int i = start+len; i < start+len*2; i++) {
				sb.setCharAt(i, ' ');
			}
			
			division(start, len);
			division(start+len*2, len);
		}
	}
}
