package baekjoon.step20001_30000.step24001_25000.step24201_24300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24265 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long num = Integer.parseInt(in.readLine());
		
		System.out.println((num * (num - 1)) / 2);
        System.out.println(2);
		in.close();
	}
}
