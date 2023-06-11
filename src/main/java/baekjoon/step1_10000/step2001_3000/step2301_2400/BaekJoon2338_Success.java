package baekjoon.step1_10000.step2001_3000.step2301_2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon2338_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(in.readLine());
        BigInteger B = new BigInteger(in.readLine());
		
		System.out.println(A.add(B) + "\n" + A.subtract(B) + "\n" + A.multiply(B));
		in.close();
	}
}
