package baekjoon.step10001_20000.step15001_16000.step15801_15900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15829 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		char arr[] = in.readLine().toCharArray();
		
		long sum = 0, pow = 1;
		for (int i = 0; i < num; i++) {
			sum += ((int)arr[i]-96) * pow % 1234567891;
			pow = pow * 31 % 1234567891;
		}
		
		System.out.println(sum % 1234567891);
		in.close();
	}
}

