package baekjoon.step1_10000.step2001_3000.step2301_2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon2338_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        BigInteger A = new BigInteger(in.readLine());
        BigInteger B = new BigInteger(in.readLine());
		
        sb.append(A.add(B) + "\n");
        sb.append(A.subtract(B) + "\n");
        sb.append(A.multiply(B));
        
        System.out.println(sb.toString());
		in.close();
	}
}
