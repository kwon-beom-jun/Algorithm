package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1654 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		
		int N = Integer.parseInt(arr[1]);
		int K[] = new int[Integer.parseInt(arr[0])];
		long lowLenth = 0, highLength = 0, midLength = 0;
		long length = 0;
		
		for (int i = 0; i < K.length; i++) {
			K[i] = Integer.parseInt(in.readLine());
			length += K[i];
		}
		
		int cnt;
		highLength = (length) / N + (length) % N + 1;
		
		while (lowLenth < highLength) {
			
			cnt = 0;
			midLength = (highLength + lowLenth) / 2;
			
			for (int i = 0; i < K.length; i++) {
				cnt += K[i] / midLength;
			}
			
			if (cnt < N) {
				highLength = midLength;
			} else {
				lowLenth = midLength + 1;
			}
		}
		
		System.out.println(lowLenth-1);
		in.close();
	}
}
