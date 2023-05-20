package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon1271 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		BigInteger n = new BigInteger(arr[0]);
		BigInteger m = new BigInteger(arr[1]);
		
		System.out.println(n.divide(m) + "\n" + n.mod(m));
		in.close();
	}
}
