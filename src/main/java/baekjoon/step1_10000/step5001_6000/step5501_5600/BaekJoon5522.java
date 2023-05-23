package baekjoon.step1_10000.step5001_6000.step5501_5600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5522 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		String str;
		
		while ((str = in.readLine()) != null) {
			sum += Integer.parseInt(str);		
		}
		
		System.out.println(sum);
		in.close();
	}
}
