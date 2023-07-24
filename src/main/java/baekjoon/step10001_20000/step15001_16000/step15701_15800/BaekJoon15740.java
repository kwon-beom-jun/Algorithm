package baekjoon.step10001_20000.step15001_16000.step15701_15800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon15740 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		BigInteger A = new BigInteger(arr[0]);
		BigInteger B = new BigInteger(arr[1]);
		
		System.out.println(A.add(B));
		in.close();
	}
}
